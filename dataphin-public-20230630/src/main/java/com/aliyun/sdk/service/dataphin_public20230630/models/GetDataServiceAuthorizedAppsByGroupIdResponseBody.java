// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetDataServiceAuthorizedAppsByGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceAuthorizedAppsByGroupIdResponseBody</p>
 */
public class GetDataServiceAuthorizedAppsByGroupIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInfoList")
    private java.util.List<AppInfoList> appInfoList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataServiceAuthorizedAppsByGroupIdResponseBody(Builder builder) {
        this.appInfoList = builder.appInfoList;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceAuthorizedAppsByGroupIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInfoList
     */
    public java.util.List<AppInfoList> getAppInfoList() {
        return this.appInfoList;
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

    public static final class Builder {
        private java.util.List<AppInfoList> appInfoList; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataServiceAuthorizedAppsByGroupIdResponseBody model) {
            this.appInfoList = model.appInfoList;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The list of API groups.</p>
         */
        public Builder appInfoList(java.util.List<AppInfoList> appInfoList) {
            this.appInfoList = appInfoList;
            return this;
        }

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataServiceAuthorizedAppsByGroupIdResponseBody build() {
            return new GetDataServiceAuthorizedAppsByGroupIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataServiceAuthorizedAppsByGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceAuthorizedAppsByGroupIdResponseBody</p>
     */
    public static class AppInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        @Deprecated
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("AppKeyStr")
        private String appKeyStr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private AppInfoList(Builder builder) {
            this.appKey = builder.appKey;
            this.appKeyStr = builder.appKeyStr;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfoList create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
        }

        /**
         * @return appKeyStr
         */
        public String getAppKeyStr() {
            return this.appKeyStr;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long appKey; 
            private String appKeyStr; 
            private Integer id; 
            private String name; 

            private Builder() {
            } 

            private Builder(AppInfoList model) {
                this.appKey = model.appKey;
                this.appKeyStr = model.appKeyStr;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The application key.</p>
             * <blockquote>
             * <p>Notice: Deprecated. Use AppKeyStr instead.</notice>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>The application key.</p>
             * 
             * <strong>example:</strong>
             * <p>app12345</p>
             */
            public Builder appKeyStr(String appKeyStr) {
                this.appKeyStr = appKeyStr;
                return this;
            }

            /**
             * <p>AppId</p>
             * 
             * <strong>example:</strong>
             * <p>1021</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The app name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AppInfoList build() {
                return new AppInfoList(this);
            } 

        } 

    }
}
