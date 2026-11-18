// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.internetbankopen20240612.models;

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
 * {@link ListProductReportsRequest} extends {@link RequestModel}
 *
 * <p>ListProductReportsRequest</p>
 */
public class ListProductReportsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LatestOnly")
    private Boolean latestOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    private ListProductReportsRequest(Builder builder) {
        super(builder);
        this.latestOnly = builder.latestOnly;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductReportsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latestOnly
     */
    public Boolean getLatestOnly() {
        return this.latestOnly;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<ListProductReportsRequest, Builder> {
        private Boolean latestOnly; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(ListProductReportsRequest request) {
            super(request);
            this.latestOnly = request.latestOnly;
            this.productCode = request.productCode;
        } 

        /**
         * <p>Specifies whether to return only the most recent active epoch report. If this parameter is omitted or set to false, the operation returns active reports within the last ten completed natural weeks in UTC+8, up to ten records. If set to true, the operation queries the most recent active report from all completed historical epochs, returning at most one record without the ten-week limit. Only true or false is accepted. If a character string is passed, it must be strictly lowercase true or false. Other values return InvalidParameter.LatestOnly. This operation does not support paging.</p>
         */
        public Builder latestOnly(Boolean latestOnly) {
            this.putQueryParameter("LatestOnly", latestOnly);
            this.latestOnly = latestOnly;
            return this;
        }

        /**
         * <p>The product code of the data product for which to query periodic reports. This must be consistent with the product code used when calling InvokeDataProduct. This parameter is required and allows only 1 to 128 ASCII letters, digits, periods (.), underscores (_), or hyphens (-). Leading and trailing spaces are not trimmed. If this parameter is missing or incorrectly formatted, InvalidParameter.ProductCode is returned. The query is limited to reports belonging to the current Alibaba Cloud account. If no available reports exist, an empty Reports array is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudsec.demo.v1</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public ListProductReportsRequest build() {
            return new ListProductReportsRequest(this);
        } 

    } 

}
