// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeIMVInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIMVInfosResponseBody</p>
 */
public class DescribeIMVInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ImvInfos")
    private java.util.List<ImvInfos> imvInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ImvInfos> getImvInfos() {
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
        private java.util.List<ImvInfos> imvInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeIMVInfosResponseBody model) {
            this.DBInstanceId = model.DBInstanceId;
            this.imvInfos = model.imvInfos;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The queried materialized views.</p>
         */
        public Builder imvInfos(java.util.List<ImvInfos> imvInfos) {
            this.imvInfos = imvInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIMVInfosResponseBody build() {
            return new DescribeIMVInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIMVInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIMVInfosResponseBody</p>
     */
    public static class ImvInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Base")
        private String base;

        @com.aliyun.core.annotation.NameInMap("DetailInfo")
        private String detailInfo;

        @com.aliyun.core.annotation.NameInMap("MV")
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

            private Builder() {
            } 

            private Builder(ImvInfos model) {
                this.base = model.base;
                this.detailInfo = model.detailInfo;
                this.mv = model.mv;
            } 

            /**
             * <p>The name of the table based on which the materialized view is created.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;public.&quot;t2&quot;</p>
             */
            public Builder base(String base) {
                this.base = base;
                return this;
            }

            /**
             * <p>The dependency between the materialized view and the base table and all metric values, which can be used to build a lineage graph.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;maintenance_calls&quot; : 1, &quot;avg_apply_time&quot; : 2, &quot;avg_calc_rows&quot; : 1, &quot;avg_calc_time&quot; : 11, &quot;avg_delta_rows&quot; : 1, &quot;avg_maintenance_total_time&quot; : 14, &quot;avg_maintenance_total_time_total&quot; : 14, &quot;max_apply_time&quot; : 2, &quot;max_calc_rows&quot; : 1, &quot;max_calc_time&quot; : 11, &quot;max_delta_rows&quot; : 1, &quot;max_maintenance_total_time&quot; : 14, &quot;max_maintenance_total_time_total&quot; : 14, &quot;min_apply_time&quot; : 2, &quot;min_calc_rows&quot; : 1, &quot;min_calc_time&quot; : 11, &quot;min_delta_rows&quot; : 1, &quot;min_maintenance_total_time&quot; : 14, &quot;min_maintenance_total_time_total&quot; : 14, &quot;max_outerjoin_apply_time&quot; : null, &quot;max_outerjoin_calc_rows&quot; : null, &quot;max_outerjoin_calc_time&quot; : null, &quot;max_outerjoin_delta_rows&quot; : null, &quot;avg_outerjoin_apply_time&quot; : null, &quot;avg_outerjoin_calc_rows&quot; : null, &quot;avg_outerjoin_calc_time&quot; : null, &quot;avg_outerjoin_delta_rows&quot; : null, &quot;min_outerjoin_apply_time&quot; : null, &quot;min_outerjoin_calc_rows&quot; : null, &quot;min_outerjoin_calc_time&quot; : null, &quot;min_outerjoin_delta_rows&quot; : null, &quot;create_rows&quot; : null, &quot;create_time&quot; : null, &quot;direct_visited&quot; : null, &quot;indirect_visited&quot; : null, &quot;max_refresh_rows&quot; : null, &quot;max_refresh_time&quot; : null, &quot;avg_refresh_rows&quot; : null, &quot;avg_refresh_time&quot; : null, &quot;min_refresh_rows&quot; : null, &quot;min_refresh_time&quot; : null, &quot;refresh_calls&quot; : null, &quot;avg_wait_lock_time&quot; : null, &quot;max_wait_lock_time&quot; : null, &quot;min_wait_lock_time&quot; : null, &quot;latest_maintenance_time&quot; : &quot;2023-08-09T07:39:14.753252+00:00&quot;}</p>
             */
            public Builder detailInfo(String detailInfo) {
                this.detailInfo = detailInfo;
                return this;
            }

            /**
             * <p>The name of the materialized view.</p>
             * 
             * <strong>example:</strong>
             * <p>public.&quot;mv1&quot;</p>
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
