// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainsBySourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainsBySourceResponseBody</p>
 */
public class DescribeDcdnDomainsBySourceResponseBody extends TeaModel {
    @NameInMap("DomainInfo")
    @Validation(required = true)
    private java.util.List < DomainInfo> domainInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainsBySourceResponseBody(Builder builder) {
        this.domainInfo = builder.domainInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainsBySourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainInfo
     */
    public java.util.List < DomainInfo> getDomainInfo() {
        return this.domainInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainInfo> domainInfo; 
        private String requestId; 

        /**
         * DomainInfo.
         */
        public Builder domainInfo(java.util.List < DomainInfo> domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainsBySourceResponseBody build() {
            return new DescribeDcdnDomainsBySourceResponseBody(this);
        } 

    } 

    public static class DomainList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DomainCname")
        private String domainCname;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainType")
        private String domainType;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        private DomainList(Builder builder) {
            this.createTime = builder.createTime;
            this.domainCname = builder.domainCname;
            this.domainName = builder.domainName;
            this.domainType = builder.domainType;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainCname
         */
        public String getDomainCname() {
            return this.domainCname;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String domainCname; 
            private String domainName; 
            private String domainType; 
            private String status; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CNAME。
             */
            public Builder domainCname(String domainCname) {
                this.domainCname = domainCname;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainType.
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DomainList build() {
                return new DomainList(this);
            } 

        } 

    }
    public static class DomainInfo extends TeaModel {
        @NameInMap("DomainList")
        private java.util.List < DomainList> domainList;

        @NameInMap("Source")
        private String source;

        private DomainInfo(Builder builder) {
            this.domainList = builder.domainList;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfo create() {
            return builder().build();
        }

        /**
         * @return domainList
         */
        public java.util.List < DomainList> getDomainList() {
            return this.domainList;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private java.util.List < DomainList> domainList; 
            private String source; 

            /**
             * DomainList.
             */
            public Builder domainList(java.util.List < DomainList> domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
}
