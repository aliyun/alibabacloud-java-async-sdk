// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetServiceConfResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceConfResponseBody</p>
 */
public class GetServiceConfResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Classify")
    private String classify;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("CustomServiceConf")
    private java.util.Map<String, ?> customServiceConf;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("Option")
    private java.util.Map<String, ?> option;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private GetServiceConfResponseBody(Builder builder) {
        this.classify = builder.classify;
        this.code = builder.code;
        this.customServiceConf = builder.customServiceConf;
        this.gmtModified = builder.gmtModified;
        this.msg = builder.msg;
        this.option = builder.option;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.serviceCode = builder.serviceCode;
        this.serviceType = builder.serviceType;
        this.success = builder.success;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceConfResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classify
     */
    public String getClassify() {
        return this.classify;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return customServiceConf
     */
    public java.util.Map<String, ?> getCustomServiceConf() {
        return this.customServiceConf;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return option
     */
    public java.util.Map<String, ?> getOption() {
        return this.option;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private String classify; 
        private Integer code; 
        private java.util.Map<String, ?> customServiceConf; 
        private String gmtModified; 
        private String msg; 
        private java.util.Map<String, ?> option; 
        private String requestId; 
        private String resourceType; 
        private String serviceCode; 
        private String serviceType; 
        private Boolean success; 
        private String uid; 

        private Builder() {
        } 

        private Builder(GetServiceConfResponseBody model) {
            this.classify = model.classify;
            this.code = model.code;
            this.customServiceConf = model.customServiceConf;
            this.gmtModified = model.gmtModified;
            this.msg = model.msg;
            this.option = model.option;
            this.requestId = model.requestId;
            this.resourceType = model.resourceType;
            this.serviceCode = model.serviceCode;
            this.serviceType = model.serviceType;
            this.success = model.success;
            this.uid = model.uid;
        } 

        /**
         * Classify.
         */
        public Builder classify(String classify) {
            this.classify = classify;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * CustomServiceConf.
         */
        public Builder customServiceConf(java.util.Map<String, ?> customServiceConf) {
            this.customServiceConf = customServiceConf;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Option.
         */
        public Builder option(java.util.Map<String, ?> option) {
            this.option = option;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>17726*****370735</p>
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public GetServiceConfResponseBody build() {
            return new GetServiceConfResponseBody(this);
        } 

    } 

}
