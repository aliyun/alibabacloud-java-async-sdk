// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsRegionListResponseBody} extends {@link TeaModel}
 *
 * <p>OnsRegionListResponseBody</p>
 */
public class OnsRegionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OnsRegionListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsRegionListResponseBody create() {
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>72D14A84-45E5-4E01-A6DB-F63C4721****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsRegionListResponseBody build() {
            return new OnsRegionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsRegionListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsRegionListResponseBody</p>
     */
    public static class RegionDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("OnsRegionId")
        private String onsRegionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private RegionDo(Builder builder) {
            this.channelName = builder.channelName;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.onsRegionId = builder.onsRegionId;
            this.regionName = builder.regionName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionDo create() {
            return builder().build();
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return onsRegionId
         */
        public String getOnsRegionId() {
            return this.onsRegionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String channelName; 
            private Long createTime; 
            private Long id; 
            private String onsRegionId; 
            private String regionName; 
            private Long updateTime; 

            /**
             * <p>The channel name.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1411623866000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder onsRegionId(String onsRegionId) {
                this.onsRegionId = onsRegionId;
                return this;
            }

            /**
             * <p>The region name.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Hangzhou)</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The time when the instance was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1411623866000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public RegionDo build() {
                return new RegionDo(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsRegionListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsRegionListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionDo")
        private java.util.List < RegionDo> regionDo;

        private Data(Builder builder) {
            this.regionDo = builder.regionDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return regionDo
         */
        public java.util.List < RegionDo> getRegionDo() {
            return this.regionDo;
        }

        public static final class Builder {
            private java.util.List < RegionDo> regionDo; 

            /**
             * RegionDo.
             */
            public Builder regionDo(java.util.List < RegionDo> regionDo) {
                this.regionDo = regionDo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
