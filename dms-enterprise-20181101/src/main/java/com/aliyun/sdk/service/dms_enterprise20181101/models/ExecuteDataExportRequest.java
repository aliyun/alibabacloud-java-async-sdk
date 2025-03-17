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
 * {@link ExecuteDataExportRequest} extends {@link RequestModel}
 *
 * <p>ExecuteDataExportRequest</p>
 */
public class ExecuteDataExportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionDetail")
    private java.util.Map<String, ?> actionDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealLoginUserUid")
    private String realLoginUserUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private ExecuteDataExportRequest(Builder builder) {
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

    public static ExecuteDataExportRequest create() {
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
    public java.util.Map<String, ?> getActionDetail() {
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
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ExecuteDataExportRequest, Builder> {
        private String regionId; 
        private java.util.Map<String, ?> actionDetail; 
        private Long orderId; 
        private String realLoginUserUid; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteDataExportRequest request) {
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
         * <p>The parameters that are required to perform the operation. Sample code:</p>
         * <pre><code class="language-json">{
         *   &quot;mode&quot; : &quot;FAST&quot;,   // The mode in which data is exported. Default value: FAST. A value of NORMAL specifies that the export task can be terminated during the export.  &quot;encoding&quot; : &quot;UTF8&quot;,  // The encoding format.  &quot;startTime&quot; : &quot;2022-12-22 00:00:00&quot;,  // The point in time at which data export starts.  &quot;transaction&quot; : false,    // Specifies whether to enable transactions.  &quot;fileType&quot; : &quot;SQL&quot;    // The format of the exported file.}
         * </code></pre>
         * <blockquote>
         * <p> You can also set mode, encoding, and fileType to the following values:</p>
         * </blockquote>
         * <ul>
         * <li><p>mode: NORMAL</p>
         * </li>
         * <li><p>encoding: UTF8MB4, GB2312, ISO_8859_1, GBK, LATAIN1, or CP1252</p>
         * </li>
         * <li><p>fileType: XLSX, CSV, JSON, or TXT</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{    &quot;fileType&quot;: &quot;CSV&quot;,    &quot;encoding&quot;: &quot;&quot;  }</p>
         */
        public Builder actionDetail(java.util.Map<String, ?> actionDetail) {
            String actionDetailShrink = shrink(actionDetail, "ActionDetail", "json");
            this.putQueryParameter("ActionDetail", actionDetailShrink);
            this.actionDetail = actionDetail;
            return this;
        }

        /**
         * <p>The ID of the ticket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is used to call the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>21400447956867****</p>
         */
        public Builder realLoginUserUid(String realLoginUserUid) {
            this.putQueryParameter("RealLoginUserUid", realLoginUserUid);
            this.realLoginUserUid = realLoginUserUid;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ExecuteDataExportRequest build() {
            return new ExecuteDataExportRequest(this);
        } 

    } 

}
