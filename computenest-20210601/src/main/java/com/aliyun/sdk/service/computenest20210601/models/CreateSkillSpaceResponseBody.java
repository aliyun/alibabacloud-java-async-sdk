// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSkillSpaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSkillSpaceResponseBody</p>
 */
public class CreateSkillSpaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillSpaceId")
    private String skillSpaceId;

    private CreateSkillSpaceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.skillSpaceId = builder.skillSpaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillSpaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillSpaceId
     */
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

    public static final class Builder {
        private String requestId; 
        private String skillSpaceId; 

        private Builder() {
        } 

        private Builder(CreateSkillSpaceResponseBody model) {
            this.requestId = model.requestId;
            this.skillSpaceId = model.skillSpaceId;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SkillSpace ID</p>
         * 
         * <strong>example:</strong>
         * <p>ss-11111</p>
         */
        public Builder skillSpaceId(String skillSpaceId) {
            this.skillSpaceId = skillSpaceId;
            return this;
        }

        public CreateSkillSpaceResponseBody build() {
            return new CreateSkillSpaceResponseBody(this);
        } 

    } 

}
