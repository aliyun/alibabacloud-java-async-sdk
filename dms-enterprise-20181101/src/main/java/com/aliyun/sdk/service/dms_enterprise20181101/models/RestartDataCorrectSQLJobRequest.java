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
 * {@link RestartDataCorrectSQLJobRequest} extends {@link RequestModel}
 *
 * <p>RestartDataCorrectSQLJobRequest</p>
 */
public class RestartDataCorrectSQLJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealLoginUserUid")
    private String realLoginUserUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private RestartDataCorrectSQLJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobId = builder.jobId;
        this.orderId = builder.orderId;
        this.realLoginUserUid = builder.realLoginUserUid;
        this.tid = builder.tid;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartDataCorrectSQLJobRequest create() {
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
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return realLoginUserUid
     */
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<RestartDataCorrectSQLJobRequest, Builder> {
        private String regionId; 
        private Long jobId; 
        private Long orderId; 
        private String realLoginUserUid; 
        private Long tid; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(RestartDataCorrectSQLJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobId = request.jobId;
            this.orderId = request.orderId;
            this.realLoginUserUid = request.realLoginUserUid;
            this.tid = request.tid;
            this.type = request.type;
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
         * <p>The ID of the SQL task. You can call the <a href="https://help.aliyun.com/document_detail/208481.html">GetDataCorrectTaskDetail</a> and <a href="https://help.aliyun.com/document_detail/207049.html">ListDBTaskSQLJob</a> operations to obtain the value of this parameter.</p>
         * <p>If the Type parameter is set to SINGLE, you must pass the value of the JobId parameter to confirm the ID of the SQL task that you want to rerun.</p>
         * 
         * <strong>example:</strong>
         * <p>43253</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The ID of the data change ticket. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to query the ID of the data change ticket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>453****</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * RealLoginUserUid.
         */
        public Builder realLoginUserUid(String realLoginUserUid) {
            this.putQueryParameter("RealLoginUserUid", realLoginUserUid);
            this.realLoginUserUid = realLoginUserUid;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * <p>The type of the rerun operation. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong>: reruns all SQL tasks.</li>
         * <li><strong>SINGLE</strong>: reruns a single SQL task.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public RestartDataCorrectSQLJobRequest build() {
            return new RestartDataCorrectSQLJobRequest(this);
        } 

    } 

}
