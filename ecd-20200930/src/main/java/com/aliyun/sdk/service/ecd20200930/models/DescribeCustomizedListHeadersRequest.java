// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeCustomizedListHeadersRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomizedListHeadersRequest</p>
 */
public class DescribeCustomizedListHeadersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LangType")
    private String langType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListType")
    private String listType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeCustomizedListHeadersRequest(Builder builder) {
        super(builder);
        this.langType = builder.langType;
        this.listType = builder.listType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizedListHeadersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return langType
     */
    public String getLangType() {
        return this.langType;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomizedListHeadersRequest, Builder> {
        private String langType; 
        private String listType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomizedListHeadersRequest request) {
            super(request);
            this.langType = request.langType;
            this.listType = request.listType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The language type for exporting the WUYING Workspace list.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder langType(String langType) {
            this.putQueryParameter("LangType", langType);
            this.langType = langType;
            return this;
        }

        /**
         * <p>The list type.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        public Builder listType(String listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * <p>The region ID. You can invoke <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to obtain the list of regions supported by WUYING Workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeCustomizedListHeadersRequest build() {
            return new DescribeCustomizedListHeadersRequest(this);
        } 

    } 

}
