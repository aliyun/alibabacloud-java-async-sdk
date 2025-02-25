// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateDNADBResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDNADBResponseBody</p>
 */
public class CreateDNADBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInfo")
    private DBInfo DBInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDNADBResponseBody(Builder builder) {
        this.DBInfo = builder.DBInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDNADBResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInfo
     */
    public DBInfo getDBInfo() {
        return this.DBInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBInfo DBInfo; 
        private String requestId; 

        /**
         * <p>The details of the media fingerprint library.</p>
         */
        public Builder DBInfo(DBInfo DBInfo) {
            this.DBInfo = DBInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDNADBResponseBody build() {
            return new CreateDNADBResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDNADBResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDNADBResponseBody</p>
     */
    public static class DBInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBId")
        private String DBId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DBInfo(Builder builder) {
            this.DBId = builder.DBId;
            this.description = builder.description;
            this.model = builder.model;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInfo create() {
            return builder().build();
        }

        /**
         * @return DBId
         */
        public String getDBId() {
            return this.DBId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String DBId; 
            private String description; 
            private String model; 
            private String name; 
            private String status; 

            /**
             * <p>The ID of the media fingerprint library. We recommend that you save this ID for subsequent calls of other operations.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e47098a5b665e2a12****</p>
             */
            public Builder DBId(String DBId) {
                this.DBId = DBId;
                return this;
            }

            /**
             * <p>The description of the media fingerprint library.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The model of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>Video</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The name of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>example name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The state of the media fingerprint library. After a media fingerprint library is created, it enters the offline state. After the media fingerprint library is processed at the backend, it enters the active state.</p>
             * 
             * <strong>example:</strong>
             * <p>offline</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DBInfo build() {
                return new DBInfo(this);
            } 

        } 

    }
}
