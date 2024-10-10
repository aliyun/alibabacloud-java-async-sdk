// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link IgnoreIdcProbeScanResultRequest} extends {@link RequestModel}
 *
 * <p>IgnoreIdcProbeScanResultRequest</p>
 */
public class IgnoreIdcProbeScanResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ignoreAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanResultIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scanResultIds;

    private IgnoreIdcProbeScanResultRequest(Builder builder) {
        super(builder);
        this.ignoreAction = builder.ignoreAction;
        this.scanResultIds = builder.scanResultIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IgnoreIdcProbeScanResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ignoreAction
     */
    public Integer getIgnoreAction() {
        return this.ignoreAction;
    }

    /**
     * @return scanResultIds
     */
    public String getScanResultIds() {
        return this.scanResultIds;
    }

    public static final class Builder extends Request.Builder<IgnoreIdcProbeScanResultRequest, Builder> {
        private Integer ignoreAction; 
        private String scanResultIds; 

        private Builder() {
            super();
        } 

        private Builder(IgnoreIdcProbeScanResultRequest request) {
            super(request);
            this.ignoreAction = request.ignoreAction;
            this.scanResultIds = request.scanResultIds;
        } 

        /**
         * <p>The operation that you want to perform. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: adds the scan result to the whitelist.</li>
         * <li><strong>2</strong>: ignores the scan result.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ignoreAction(Integer ignoreAction) {
            this.putQueryParameter("IgnoreAction", ignoreAction);
            this.ignoreAction = ignoreAction;
            return this;
        }

        /**
         * <p>The ID of the scan result. Separate multiple IDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeIdcProbeScanResultList~~">DescribeIdcProbeScanResultList</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>332098932,332098964,332098963</p>
         */
        public Builder scanResultIds(String scanResultIds) {
            this.putQueryParameter("ScanResultIds", scanResultIds);
            this.scanResultIds = scanResultIds;
            return this;
        }

        @Override
        public IgnoreIdcProbeScanResultRequest build() {
            return new IgnoreIdcProbeScanResultRequest(this);
        } 

    } 

}
