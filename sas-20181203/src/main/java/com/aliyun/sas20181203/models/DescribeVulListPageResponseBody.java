// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeVulListPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulListPageResponseBody</p>
 */
public class DescribeVulListPageResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;


    private DescribeVulListPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulListPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>返回参数</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulListPageResponseBody build() {
            return new DescribeVulListPageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CveId")
        private String cveId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsAegis")
        private Integer isAegis;

        @NameInMap("IsSas")
        private Integer isSas;

        @NameInMap("OtherId")
        private String otherId;

        @NameInMap("ReleaseTime")
        private Long releaseTime;

        @NameInMap("Title")
        private String title;


        private Data(Builder builder) {
            this.cveId = builder.cveId;
            this.id = builder.id;
            this.isAegis = builder.isAegis;
            this.isSas = builder.isSas;
            this.otherId = builder.otherId;
            this.releaseTime = builder.releaseTime;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isAegis
         */
        public Integer getIsAegis() {
            return this.isAegis;
        }

        /**
         * @return isSas
         */
        public Integer getIsSas() {
            return this.isSas;
        }

        /**
         * @return otherId
         */
        public String getOtherId() {
            return this.otherId;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String cveId; 
            private Long id; 
            private Integer isAegis; 
            private Integer isSas; 
            private String otherId; 
            private Long releaseTime; 
            private String title; 

            /**
             * <p>cveId</p>
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * <p>id</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>是否安骑士扫描</p>
             */
            public Builder isAegis(Integer isAegis) {
                this.isAegis = isAegis;
                return this;
            }

            /**
             * <p>是否网络扫描</p>
             */
            public Builder isSas(Integer isSas) {
                this.isSas = isSas;
                return this;
            }

            /**
             * <p>编号</p>
             */
            public Builder otherId(String otherId) {
                this.otherId = otherId;
                return this;
            }

            /**
             * <p>发布时间</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>漏洞标题</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
