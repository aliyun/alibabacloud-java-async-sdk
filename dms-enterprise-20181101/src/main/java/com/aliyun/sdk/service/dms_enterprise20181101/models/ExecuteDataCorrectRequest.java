// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteDataCorrectRequest} extends {@link RequestModel}
 *
 * <p>ExecuteDataCorrectRequest</p>
 */
public class ExecuteDataCorrectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionDetail")
    private java.util.Map < String, ? > actionDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealLoginUserUid")
    private String realLoginUserUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private String tid;

    private ExecuteDataCorrectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.actionDetail = builder.actionDetail;
        this.orderId = builder.orderId;
        this.realLoginUserUid = builder.realLoginUserUid;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteDataCorrectRequest create() {
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
     * @return actionDetail
     */
    public java.util.Map < String, ? > getActionDetail() {
        return this.actionDetail;
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
    public String getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ExecuteDataCorrectRequest, Builder> {
        private String regionId; 
        private java.util.Map < String, ? > actionDetail; 
        private Long orderId; 
        private String realLoginUserUid; 
        private String tid; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteDataCorrectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.actionDetail = request.actionDetail;
            this.orderId = request.orderId;
            this.realLoginUserUid = request.realLoginUserUid;
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
         * <p>The parameters that are required to perform the data change.</p>
         * <pre><code>
         * json
         * &quot;actionDetail&quot; : {
         *     &quot;startTime&quot; :&quot;2021-07-01 00:00:00&quot;, // Specify the start time to change data. If you want to immediately change data, you do not need to set this parameter. 
         *     &quot;endTime&quot; : &quot;2021-07-01 01:00:00&quot;, // Specify the end time to change data. If you want to immediately change data, you do not need to set this parameter. 
         *     &quot;transaction&quot; : false, // Specify whether to change data as a transaction. 
         *     &quot;backupData&quot; : true // Specify whether to back up data. 
         *   }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;startTime&quot; : &quot;2021-07-01 00:00:00&quot;, &quot;endTime&quot; : &quot;2021-07-01 01:00:00&quot;, &quot;transaction&quot; : false, &quot;backupData&quot; : true }</p>
         */
        public Builder actionDetail(java.util.Map < String, ? > actionDetail) {
            String actionDetailShrink = shrink(actionDetail, "ActionDetail", "json");
            this.putQueryParameter("ActionDetail", actionDetailShrink);
            this.actionDetail = actionDetail;
            return this;
        }

        /**
         * <p>The ID of the ticket. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to query the ID of the ticket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>406****</p>
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
        public Builder tid(String tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ExecuteDataCorrectRequest build() {
            return new ExecuteDataCorrectRequest(this);
        } 

    } 

}
