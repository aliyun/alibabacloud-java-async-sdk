// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityBySupplierUidResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCommodityBySupplierUidResponseBody</p>
 */
public class QueryCommodityBySupplierUidResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ForceFatal")
    private Boolean forceFatal;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private QueryCommodityBySupplierUidResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicMessage = builder.dynamicMessage;
        this.forceFatal = builder.forceFatal;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommodityBySupplierUidResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return forceFatal
     */
    public Boolean getForceFatal() {
        return this.forceFatal;
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
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String dynamicMessage; 
        private Boolean forceFatal; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ForceFatal.
         */
        public Builder forceFatal(Boolean forceFatal) {
            this.forceFatal = forceFatal;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCommodityBySupplierUidResponseBody build() {
            return new QueryCommodityBySupplierUidResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("IconUrl")
        private String iconUrl;

        @NameInMap("Name")
        private String name;

        @NameInMap("VersionList")
        private java.util.List < String > versionList;

        private Result(Builder builder) {
            this.code = builder.code;
            this.iconUrl = builder.iconUrl;
            this.name = builder.name;
            this.versionList = builder.versionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return versionList
         */
        public java.util.List < String > getVersionList() {
            return this.versionList;
        }

        public static final class Builder {
            private String code; 
            private String iconUrl; 
            private String name; 
            private java.util.List < String > versionList; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * VersionList.
             */
            public Builder versionList(java.util.List < String > versionList) {
                this.versionList = versionList;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
