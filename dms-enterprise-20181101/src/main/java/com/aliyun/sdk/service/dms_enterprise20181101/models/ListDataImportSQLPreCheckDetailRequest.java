// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListDataImportSQLPreCheckDetailRequest} extends {@link RequestModel}
 *
 * <p>ListDataImportSQLPreCheckDetailRequest</p>
 */
public class ListDataImportSQLPreCheckDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumer")
    private Long pageNumer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlType")
    private String sqlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private String statusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListDataImportSQLPreCheckDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.orderId = builder.orderId;
        this.pageNumer = builder.pageNumer;
        this.pageSize = builder.pageSize;
        this.sqlType = builder.sqlType;
        this.statusCode = builder.statusCode;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataImportSQLPreCheckDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return pageNumer
     */
    public Long getPageNumer() {
        return this.pageNumer;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * @return statusCode
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListDataImportSQLPreCheckDetailRequest, Builder> {
        private String regionId; 
        private Long orderId; 
        private Long pageNumer; 
        private Long pageSize; 
        private String sqlType; 
        private String statusCode; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListDataImportSQLPreCheckDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.orderId = request.orderId;
            this.pageNumer = request.pageNumer;
            this.pageSize = request.pageSize;
            this.sqlType = request.sqlType;
            this.statusCode = request.statusCode;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ticket ID. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to query the ticket ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11****</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumer(Long pageNumer) {
            this.putQueryParameter("PageNumer", pageNumer);
            this.pageNumer = pageNumer;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the SQL statement. Valid values:</p>
         * <ul>
         * <li><strong>SELECT</strong></li>
         * <li><strong>INSERT</strong></li>
         * <li><strong>DELETE</strong></li>
         * <li><strong>CREATE_TABLE</strong></li>
         * </ul>
         * <blockquote>
         * <p>You can log on to the Data Management (DMS) console and choose <strong>Security and Specifications</strong> &gt; <strong>Operation Audit</strong> in the top navigation bar to view more types of SQL statements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>INSERT</p>
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * <p>The state of the ticket. If you leave this parameter empty, all the states are queried by default. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The ticket is being initialized.</li>
         * <li><strong>RUNNING</strong>: The ticket is in progress.</li>
         * <li><strong>SUCCESS</strong>: The ticket is complete.</li>
         * <li><strong>TIMEOUT</strong>: The ticket is skipped due to timeout.</li>
         * <li><strong>FAIL</strong>: The ticket fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder statusCode(String statusCode) {
            this.putQueryParameter("StatusCode", statusCode);
            this.statusCode = statusCode;
            return this;
        }

        /**
         * <p>The tenant ID. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListDataImportSQLPreCheckDetailRequest build() {
            return new ListDataImportSQLPreCheckDetailRequest(this);
        } 

    } 

}
