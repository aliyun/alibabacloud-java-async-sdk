// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataDownloadURLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataDownloadURLResponseBody</p>
 */
public class DescribeDataDownloadURLResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDataDownloadURLResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataDownloadURLResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The download URLs of data files.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The response message. Success is returned for a successful request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataDownloadURLResponseBody build() {
            return new DescribeDataDownloadURLResponseBody(this);
        } 

    } 

    public static class ServerList extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("RegionId")
        private String regionId;

        private ServerList(Builder builder) {
            this.host = builder.host;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerList create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String host; 
            private String regionId; 

            /**
             * The host address of the file server.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The ID of the Edge Node Service (ENS) node.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public ServerList build() {
                return new ServerList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("ServerList")
        private java.util.List < ServerList> serverList;

        @NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.expireTime = builder.expireTime;
            this.serverList = builder.serverList;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return serverList
         */
        public java.util.List < ServerList> getServerList() {
            return this.serverList;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String expireTime; 
            private java.util.List < ServerList> serverList; 
            private String url; 

            /**
             * The time when the data file expires. The time is displayed in UTC.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The file servers.
             */
            public Builder serverList(java.util.List < ServerList> serverList) {
                this.serverList = serverList;
                return this;
            }

            /**
             * The download URL of the data file.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
