// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIMVInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIMVInfosResponseBody</p>
 */
public class DescribeIMVInfosResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("ImvInfos")
    private java.util.List < ImvInfos> imvInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIMVInfosResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.imvInfos = builder.imvInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIMVInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return imvInfos
     */
    public java.util.List < ImvInfos> getImvInfos() {
        return this.imvInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private java.util.List < ImvInfos> imvInfos; 
        private String requestId; 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ImvInfos.
         */
        public Builder imvInfos(java.util.List < ImvInfos> imvInfos) {
            this.imvInfos = imvInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIMVInfosResponseBody build() {
            return new DescribeIMVInfosResponseBody(this);
        } 

    } 

    public static class ImvInfos extends TeaModel {
        @NameInMap("Base")
        private String base;

        @NameInMap("DetailInfo")
        private String detailInfo;

        @NameInMap("MV")
        private String mv;

        private ImvInfos(Builder builder) {
            this.base = builder.base;
            this.detailInfo = builder.detailInfo;
            this.mv = builder.mv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImvInfos create() {
            return builder().build();
        }

        /**
         * @return base
         */
        public String getBase() {
            return this.base;
        }

        /**
         * @return detailInfo
         */
        public String getDetailInfo() {
            return this.detailInfo;
        }

        /**
         * @return mv
         */
        public String getMv() {
            return this.mv;
        }

        public static final class Builder {
            private String base; 
            private String detailInfo; 
            private String mv; 

            /**
             * Base.
             */
            public Builder base(String base) {
                this.base = base;
                return this;
            }

            /**
             * DetailInfo.
             */
            public Builder detailInfo(String detailInfo) {
                this.detailInfo = detailInfo;
                return this;
            }

            /**
             * MV.
             */
            public Builder mv(String mv) {
                this.mv = mv;
                return this;
            }

            public ImvInfos build() {
                return new ImvInfos(this);
            } 

        } 

    }
}
