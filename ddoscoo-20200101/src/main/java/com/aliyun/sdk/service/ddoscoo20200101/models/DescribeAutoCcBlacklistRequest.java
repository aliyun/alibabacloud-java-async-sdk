// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeAutoCcBlacklistRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoCcBlacklistRequest</p>
 */
public class DescribeAutoCcBlacklistRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    private DescribeAutoCcBlacklistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.keyWord = builder.keyWord;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoCcBlacklistRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    public static final class Builder extends Request.Builder<DescribeAutoCcBlacklistRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String keyWord; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutoCcBlacklistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.keyWord = request.keyWord;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
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
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The keyword for the query. This keyword is used to specify the prefix of the source IP address that you want to query.</p>
         * <blockquote>
         * <p>The keyword must be greater than three characters in length.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>138</p>
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>The number of the page to return. For example, to query the returned results on the first page, set the value to <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        @Override
        public DescribeAutoCcBlacklistRequest build() {
            return new DescribeAutoCcBlacklistRequest(this);
        } 

    } 

}
