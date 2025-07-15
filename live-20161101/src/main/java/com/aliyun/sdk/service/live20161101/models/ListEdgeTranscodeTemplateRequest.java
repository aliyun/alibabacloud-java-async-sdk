// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListEdgeTranscodeTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListEdgeTranscodeTemplateRequest</p>
 */
public class ListEdgeTranscodeTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoCodec")
    private String videoCodec;

    private ListEdgeTranscodeTemplateRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.keyword = builder.keyword;
        this.ownerId = builder.ownerId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sortBy = builder.sortBy;
        this.type = builder.type;
        this.videoCodec = builder.videoCodec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEdgeTranscodeTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return videoCodec
     */
    public String getVideoCodec() {
        return this.videoCodec;
    }

    public static final class Builder extends Request.Builder<ListEdgeTranscodeTemplateRequest, Builder> {
        private String clusterId; 
        private String keyword; 
        private Long ownerId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String regionId; 
        private String sortBy; 
        private String type; 
        private String videoCodec; 

        private Builder() {
            super();
        } 

        private Builder(ListEdgeTranscodeTemplateRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.keyword = request.keyword;
            this.ownerId = request.ownerId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sortBy = request.sortBy;
            this.type = request.type;
            this.videoCodec = request.videoCodec;
        } 

        /**
         * <p>The ID of the data center.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3b-4d18-395c-8106-ff21a6</strong></strong></strong></p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The keyword of the query.</p>
         * <ul>
         * <li>You can specify a template ID for an exact match.</li>
         * <li>You can also specify a template name for a fuzzy match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>baseline</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The sorting order of the templates by creation time. Default value: desc. Valid values:</p>
         * <ul>
         * <li>desc: descending order.</li>
         * <li>asc: ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The type of edge transcoding. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: standard transcoding and Narrowband HD™ 1.0 transcoding.</li>
         * <li><strong>nbhd-2</strong>: Narrowband HD™ 2.0 transcoding.</li>
         * <li><strong>ultra-hd</strong>: ultra-high definition transcoding.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the query result is filtered based on the type of edge transcoding on which you are granted permissions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>nbhd-2</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The video encoding format. Valid values:</p>
         * <ul>
         * <li>H.264</li>
         * <li>H.265</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the query result is filtered based on the video encoding format on which you are granted permissions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        public Builder videoCodec(String videoCodec) {
            this.putQueryParameter("VideoCodec", videoCodec);
            this.videoCodec = videoCodec;
            return this;
        }

        @Override
        public ListEdgeTranscodeTemplateRequest build() {
            return new ListEdgeTranscodeTemplateRequest(this);
        } 

    } 

}
