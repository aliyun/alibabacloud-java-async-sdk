// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link QueryLocationServiceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLocationServiceResponseBody</p>
 */
public class QueryLocationServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorName")
    private String errorName;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryLocationServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorName = builder.errorName;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLocationServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorName
     */
    public String getErrorName() {
        return this.errorName;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private String code; 
        private Data data; 
        private String errorName; 
        private Integer httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryLocationServiceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorName = model.errorName;
            this.httpCode = model.httpCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorName.
         */
        public Builder errorName(String errorName) {
            this.errorName = errorName;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
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

        public QueryLocationServiceResponseBody build() {
            return new QueryLocationServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryLocationServiceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLocationServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private Long imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private Long qps;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SvcDeployStatus")
        private String svcDeployStatus;

        @com.aliyun.core.annotation.NameInMap("SvcState")
        private String svcState;

        @com.aliyun.core.annotation.NameInMap("TreeConfig")
        private String treeConfig;

        @com.aliyun.core.annotation.NameInMap("UuidLogMap")
        private String uuidLogMap;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.expireTime = builder.expireTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.name = builder.name;
            this.note = builder.note;
            this.qps = builder.qps;
            this.startTime = builder.startTime;
            this.svcDeployStatus = builder.svcDeployStatus;
            this.svcState = builder.svcState;
            this.treeConfig = builder.treeConfig;
            this.uuidLogMap = builder.uuidLogMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return imageId
         */
        public Long getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return qps
         */
        public Long getQps() {
            return this.qps;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return svcDeployStatus
         */
        public String getSvcDeployStatus() {
            return this.svcDeployStatus;
        }

        /**
         * @return svcState
         */
        public String getSvcState() {
            return this.svcState;
        }

        /**
         * @return treeConfig
         */
        public String getTreeConfig() {
            return this.treeConfig;
        }

        /**
         * @return uuidLogMap
         */
        public String getUuidLogMap() {
            return this.uuidLogMap;
        }

        public static final class Builder {
            private String appId; 
            private String expireTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long imageId; 
            private String imageName; 
            private String name; 
            private String note; 
            private Long qps; 
            private String startTime; 
            private String svcDeployStatus; 
            private String svcState; 
            private String treeConfig; 
            private String uuidLogMap; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.expireTime = model.expireTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.name = model.name;
                this.note = model.note;
                this.qps = model.qps;
                this.startTime = model.startTime;
                this.svcDeployStatus = model.svcDeployStatus;
                this.svcState = model.svcState;
                this.treeConfig = model.treeConfig;
                this.uuidLogMap = model.uuidLogMap;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(Long imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
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
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * SvcDeployStatus.
             */
            public Builder svcDeployStatus(String svcDeployStatus) {
                this.svcDeployStatus = svcDeployStatus;
                return this;
            }

            /**
             * SvcState.
             */
            public Builder svcState(String svcState) {
                this.svcState = svcState;
                return this;
            }

            /**
             * TreeConfig.
             */
            public Builder treeConfig(String treeConfig) {
                this.treeConfig = treeConfig;
                return this;
            }

            /**
             * UuidLogMap.
             */
            public Builder uuidLogMap(String uuidLogMap) {
                this.uuidLogMap = uuidLogMap;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
