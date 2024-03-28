// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebHostingConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetWebHostingConfigResponseBody</p>
 */
public class GetWebHostingConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetWebHostingConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebHostingConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWebHostingConfigResponseBody build() {
            return new GetWebHostingConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AllowedIps")
        private String allowedIps;

        @NameInMap("DefaultDomain")
        private String defaultDomain;

        @NameInMap("ErrorHttpStatus")
        private String errorHttpStatus;

        @NameInMap("ErrorPath")
        private String errorPath;

        @NameInMap("IndexPath")
        private String indexPath;

        @NameInMap("SpaceId")
        private String spaceId;

        private Data(Builder builder) {
            this.allowedIps = builder.allowedIps;
            this.defaultDomain = builder.defaultDomain;
            this.errorHttpStatus = builder.errorHttpStatus;
            this.errorPath = builder.errorPath;
            this.indexPath = builder.indexPath;
            this.spaceId = builder.spaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allowedIps
         */
        public String getAllowedIps() {
            return this.allowedIps;
        }

        /**
         * @return defaultDomain
         */
        public String getDefaultDomain() {
            return this.defaultDomain;
        }

        /**
         * @return errorHttpStatus
         */
        public String getErrorHttpStatus() {
            return this.errorHttpStatus;
        }

        /**
         * @return errorPath
         */
        public String getErrorPath() {
            return this.errorPath;
        }

        /**
         * @return indexPath
         */
        public String getIndexPath() {
            return this.indexPath;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        public static final class Builder {
            private String allowedIps; 
            private String defaultDomain; 
            private String errorHttpStatus; 
            private String errorPath; 
            private String indexPath; 
            private String spaceId; 

            /**
             * AllowedIps.
             */
            public Builder allowedIps(String allowedIps) {
                this.allowedIps = allowedIps;
                return this;
            }

            /**
             * DefaultDomain.
             */
            public Builder defaultDomain(String defaultDomain) {
                this.defaultDomain = defaultDomain;
                return this;
            }

            /**
             * ErrorHttpStatus.
             */
            public Builder errorHttpStatus(String errorHttpStatus) {
                this.errorHttpStatus = errorHttpStatus;
                return this;
            }

            /**
             * ErrorPath.
             */
            public Builder errorPath(String errorPath) {
                this.errorPath = errorPath;
                return this;
            }

            /**
             * IndexPath.
             */
            public Builder indexPath(String indexPath) {
                this.indexPath = indexPath;
                return this;
            }

            /**
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
