// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitSetRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataLimitSetRequest</p>
 */
public class DescribeDataLimitSetRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ParentId")
    private String parentId;

    @Query
    @NameInMap("ResourceType")
    private Integer resourceType;

    private DescribeDataLimitSetRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.parentId = builder.parentId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataLimitSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeDataLimitSetRequest, Builder> {
        private String lang; 
        private String parentId; 
        private Integer resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataLimitSetRequest request) {
            super(request);
            this.lang = request.lang;
            this.parentId = request.parentId;
            this.resourceType = request.resourceType;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Simplified Chinese (default)
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The parent asset ID of the data asset.
         * <p>
         * 
         * You can call the [DescribeDataLimitDetail](~~DescribeDataLimitDetail~~) or [DescribeDataLimits](~~DescribeDataLimits~~) operation to obtain the parent asset ID of the data asset from the value of the **ParentId** parameter.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * The type of service to which the data asset belongs. Valid values:
         * <p>
         * 
         * *   **1**: MaxCompute
         * *   **2**: OSS
         * *   **3**: AnalyticDB for MySQL
         * *   **4**: Tablestore
         * *   **5**: ApsaraDB RDS
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeDataLimitSetRequest build() {
            return new DescribeDataLimitSetRequest(this);
        } 

    } 

}
