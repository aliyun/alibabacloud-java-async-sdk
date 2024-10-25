// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataDownloadURLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataDownloadURLResponseBody</p>
 */
public class DescribeDataDownloadURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The download URLs of data files.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. Success is returned for a successful request.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataDownloadURLResponseBody build() {
            return new DescribeDataDownloadURLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataDownloadURLResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataDownloadURLResponseBody</p>
     */
    public static class ServerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
             * <p>The host address of the file server.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1:8080</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The ID of the Edge Node Service (ENS) node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chenzhou-5</p>
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
    /**
     * 
     * {@link DescribeDataDownloadURLResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataDownloadURLResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ServerList")
        private java.util.List < ServerList> serverList;

        @com.aliyun.core.annotation.NameInMap("Url")
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
             * <p>The time when the data file expires. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-10T03:36:27Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The file servers.</p>
             */
            public Builder serverList(java.util.List < ServerList> serverList) {
                this.serverList = serverList;
                return this;
            }

            /**
             * <p>The download URL of the data file.</p>
             * 
             * <strong>example:</strong>
             * <p>/file/1450088842124331/97a32f2a-aa2c-436a-b19c-05b20d258618/f0313053530fc727f81b7d03fad93cd2/e4c2e8edac362acab7123654b9e73432?ak=edgepaas-innerapi-daily&amp;ts=1611229454&amp;sign=Yycbax%2F4OsTgm6BLoxR6lPs5gKE%3D</p>
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
