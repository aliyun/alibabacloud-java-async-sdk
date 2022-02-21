// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrunksOfSkillGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrunksOfSkillGroupResponseBody</p>
 */
public class ListTrunksOfSkillGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TrunkConfigs")
    private java.util.List < TrunkConfigs> trunkConfigs;

    private ListTrunksOfSkillGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.trunkConfigs = builder.trunkConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrunksOfSkillGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return trunkConfigs
     */
    public java.util.List < TrunkConfigs> getTrunkConfigs() {
        return this.trunkConfigs;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < TrunkConfigs> trunkConfigs; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TrunkConfigs.
         */
        public Builder trunkConfigs(java.util.List < TrunkConfigs> trunkConfigs) {
            this.trunkConfigs = trunkConfigs;
            return this;
        }

        public ListTrunksOfSkillGroupResponseBody build() {
            return new ListTrunksOfSkillGroupResponseBody(this);
        } 

    } 

    public static class TrunkConfigs extends TeaModel {
        @NameInMap("Primary")
        private Boolean primary;

        @NameInMap("ProviderName")
        private String providerName;

        private TrunkConfigs(Builder builder) {
            this.primary = builder.primary;
            this.providerName = builder.providerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrunkConfigs create() {
            return builder().build();
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        public static final class Builder {
            private Boolean primary; 
            private String providerName; 

            /**
             * Primary.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * ProviderName.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            public TrunkConfigs build() {
                return new TrunkConfigs(this);
            } 

        } 

    }
}
