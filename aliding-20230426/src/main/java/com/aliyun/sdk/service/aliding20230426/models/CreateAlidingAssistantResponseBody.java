// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CreateAlidingAssistantResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlidingAssistantResponseBody</p>
 */
public class CreateAlidingAssistantResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alidingAssistantId")
    private String alidingAssistantId;

    @com.aliyun.core.annotation.NameInMap("appCode")
    private String appCode;

    @com.aliyun.core.annotation.NameInMap("jumpUrl")
    private String jumpUrl;

    @com.aliyun.core.annotation.NameInMap("processInstanceId")
    private String processInstanceId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private CreateAlidingAssistantResponseBody(Builder builder) {
        this.alidingAssistantId = builder.alidingAssistantId;
        this.appCode = builder.appCode;
        this.jumpUrl = builder.jumpUrl;
        this.processInstanceId = builder.processInstanceId;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlidingAssistantResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alidingAssistantId
     */
    public String getAlidingAssistantId() {
        return this.alidingAssistantId;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return jumpUrl
     */
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    /**
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String alidingAssistantId; 
        private String appCode; 
        private String jumpUrl; 
        private String processInstanceId; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(CreateAlidingAssistantResponseBody model) {
            this.alidingAssistantId = model.alidingAssistantId;
            this.appCode = model.appCode;
            this.jumpUrl = model.jumpUrl;
            this.processInstanceId = model.processInstanceId;
            this.requestId = model.requestId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * alidingAssistantId.
         */
        public Builder alidingAssistantId(String alidingAssistantId) {
            this.alidingAssistantId = alidingAssistantId;
            return this;
        }

        /**
         * appCode.
         */
        public Builder appCode(String appCode) {
            this.appCode = appCode;
            return this;
        }

        /**
         * jumpUrl.
         */
        public Builder jumpUrl(String jumpUrl) {
            this.jumpUrl = jumpUrl;
            return this;
        }

        /**
         * processInstanceId.
         */
        public Builder processInstanceId(String processInstanceId) {
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public CreateAlidingAssistantResponseBody build() {
            return new CreateAlidingAssistantResponseBody(this);
        } 

    } 

}
