// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreateAppResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppResponseBody</p>
 */
public class CreateAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagStatus")
    private Boolean tagStatus;

    private CreateAppResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.requestId = builder.requestId;
        this.tagStatus = builder.tagStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagStatus
     */
    public Boolean getTagStatus() {
        return this.tagStatus;
    }

    public static final class Builder {
        private Long appId; 
        private String requestId; 
        private Boolean tagStatus; 

        private Builder() {
        } 

        private Builder(CreateAppResponseBody model) {
            this.appId = model.appId;
            this.requestId = model.requestId;
            this.tagStatus = model.tagStatus;
        } 

        /**
         * <p>The unique ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>20112314518278</p>
         */
        public Builder appId(Long appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BA20890E-75C7-41BC-9C8B-73276B58F550</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the tag exists. If the value is <strong>true</strong>, the tag exists. If the value is <strong>false</strong>, the tag does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder tagStatus(Boolean tagStatus) {
            this.tagStatus = tagStatus;
            return this;
        }

        public CreateAppResponseBody build() {
            return new CreateAppResponseBody(this);
        } 

    } 

}
