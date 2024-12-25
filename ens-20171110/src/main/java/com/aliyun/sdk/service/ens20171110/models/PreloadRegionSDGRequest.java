// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link PreloadRegionSDGRequest} extends {@link RequestModel}
 *
 * <p>PreloadRegionSDGRequest</p>
 */
public class PreloadRegionSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> destinationRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespaces")
    private java.util.List<String> namespaces;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedundantNum")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 20, minimum = 1)
    private Integer redundantNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SDGId;

    private PreloadRegionSDGRequest(Builder builder) {
        super(builder);
        this.destinationRegionIds = builder.destinationRegionIds;
        this.namespaces = builder.namespaces;
        this.redundantNum = builder.redundantNum;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadRegionSDGRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationRegionIds
     */
    public java.util.List<String> getDestinationRegionIds() {
        return this.destinationRegionIds;
    }

    /**
     * @return namespaces
     */
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return redundantNum
     */
    public Integer getRedundantNum() {
        return this.redundantNum;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<PreloadRegionSDGRequest, Builder> {
        private java.util.List<String> destinationRegionIds; 
        private java.util.List<String> namespaces; 
        private Integer redundantNum; 
        private String SDGId; 

        private Builder() {
            super();
        } 

        private Builder(PreloadRegionSDGRequest request) {
            super(request);
            this.destinationRegionIds = request.destinationRegionIds;
            this.namespaces = request.namespaces;
            this.redundantNum = request.redundantNum;
            this.SDGId = request.SDGId;
        } 

        /**
         * <p>The IDs of the destination nodes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder destinationRegionIds(java.util.List<String> destinationRegionIds) {
            String destinationRegionIdsShrink = shrink(destinationRegionIds, "DestinationRegionIds", "json");
            this.putQueryParameter("DestinationRegionIds", destinationRegionIdsShrink);
            this.destinationRegionIds = destinationRegionIds;
            return this;
        }

        /**
         * <p>The namespaces.</p>
         */
        public Builder namespaces(java.util.List<String> namespaces) {
            String namespacesShrink = shrink(namespaces, "Namespaces", "json");
            this.putQueryParameter("Namespaces", namespacesShrink);
            this.namespaces = namespaces;
            return this;
        }

        /**
         * <p>The number of redundant replicas to support rapid deployment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder redundantNum(Integer redundantNum) {
            this.putQueryParameter("RedundantNum", redundantNum);
            this.redundantNum = redundantNum;
            return this;
        }

        /**
         * <p>The ID of the SDG for which data is preloaded.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxx</p>
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public PreloadRegionSDGRequest build() {
            return new PreloadRegionSDGRequest(this);
        } 

    } 

}
