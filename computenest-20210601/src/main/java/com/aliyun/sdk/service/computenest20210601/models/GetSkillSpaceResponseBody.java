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
 * {@link GetSkillSpaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillSpaceResponseBody</p>
 */
public class GetSkillSpaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillSpaceDescription")
    private String skillSpaceDescription;

    @com.aliyun.core.annotation.NameInMap("SkillSpaceId")
    private String skillSpaceId;

    @com.aliyun.core.annotation.NameInMap("SkillSpaceName")
    private String skillSpaceName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetSkillSpaceResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.requestId = builder.requestId;
        this.skillSpaceDescription = builder.skillSpaceDescription;
        this.skillSpaceId = builder.skillSpaceId;
        this.skillSpaceName = builder.skillSpaceName;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillSpaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillSpaceDescription
     */
    public String getSkillSpaceDescription() {
        return this.skillSpaceDescription;
    }

    /**
     * @return skillSpaceId
     */
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

    /**
     * @return skillSpaceName
     */
    public String getSkillSpaceName() {
        return this.skillSpaceName;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String requestId; 
        private String skillSpaceDescription; 
        private String skillSpaceId; 
        private String skillSpaceName; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetSkillSpaceResponseBody model) {
            this.createTime = model.createTime;
            this.requestId = model.requestId;
            this.skillSpaceDescription = model.skillSpaceDescription;
            this.skillSpaceId = model.skillSpaceId;
            this.skillSpaceName = model.skillSpaceName;
            this.updateTime = model.updateTime;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
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
         * SkillSpaceDescription.
         */
        public Builder skillSpaceDescription(String skillSpaceDescription) {
            this.skillSpaceDescription = skillSpaceDescription;
            return this;
        }

        /**
         * SkillSpaceId.
         */
        public Builder skillSpaceId(String skillSpaceId) {
            this.skillSpaceId = skillSpaceId;
            return this;
        }

        /**
         * SkillSpaceName.
         */
        public Builder skillSpaceName(String skillSpaceName) {
            this.skillSpaceName = skillSpaceName;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetSkillSpaceResponseBody build() {
            return new GetSkillSpaceResponseBody(this);
        } 

    } 

}
