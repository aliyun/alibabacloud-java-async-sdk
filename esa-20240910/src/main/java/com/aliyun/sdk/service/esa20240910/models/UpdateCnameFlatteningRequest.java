// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateCnameFlatteningRequest} extends {@link RequestModel}
 *
 * <p>UpdateCnameFlatteningRequest</p>
 */
public class UpdateCnameFlatteningRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlattenMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flattenMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateCnameFlatteningRequest(Builder builder) {
        super(builder);
        this.flattenMode = builder.flattenMode;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCnameFlatteningRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flattenMode
     */
    public String getFlattenMode() {
        return this.flattenMode;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateCnameFlatteningRequest, Builder> {
        private String flattenMode; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCnameFlatteningRequest request) {
            super(request);
            this.flattenMode = request.flattenMode;
            this.siteId = request.siteId;
        } 

        /**
         * <p>Flattening mode. Possible values:</p>
         * <ul>
         * <li>flatten_all: Flatten all.</li>
         * <li>flatten_at_root: Flatten only the root domain. The default is to flatten the root domain.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flatten_all</p>
         */
        public Builder flattenMode(String flattenMode) {
            this.putQueryParameter("FlattenMode", flattenMode);
            this.flattenMode = flattenMode;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public UpdateCnameFlatteningRequest build() {
            return new UpdateCnameFlatteningRequest(this);
        } 

    } 

}
