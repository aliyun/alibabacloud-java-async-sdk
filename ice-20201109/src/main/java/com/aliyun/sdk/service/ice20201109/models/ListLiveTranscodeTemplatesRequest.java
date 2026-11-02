// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListLiveTranscodeTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListLiveTranscodeTemplatesRequest</p>
 */
public class ListLiveTranscodeTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoCodec")
    private String videoCodec;

    private ListLiveTranscodeTemplatesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.keyWord = builder.keyWord;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.type = builder.type;
        this.videoCodec = builder.videoCodec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveTranscodeTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
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

    public static final class Builder extends Request.Builder<ListLiveTranscodeTemplatesRequest, Builder> {
        private String category; 
        private String keyWord; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sortBy; 
        private String type; 
        private String videoCodec; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveTranscodeTemplatesRequest request) {
            super(request);
            this.category = request.category;
            this.keyWord = request.keyWord;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.type = request.type;
            this.videoCodec = request.videoCodec;
        } 

        /**
         * <p>The template category. Valid values:</p>
         * <ul>
         * <li>system: system template.</li>
         * <li>customized: custom template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customized</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The search keyword. You can search by template ID or name. Name supports fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>my_template</p>
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
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
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
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
         * <p>The sorting order. Sorts by CreateTime. Default value: desc. Valid values:</p>
         * <ul>
         * <li>asc: ascending order.</li>
         * <li>desc: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The template type. Valid values:</p>
         * <ul>
         * <li>normal: standard.</li>
         * <li>narrow-band: narrowband HD.</li>
         * <li>audio-only: audio only.</li>
         * <li>origin: original quality.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The video codec. Valid values:</p>
         * <ul>
         * <li>H.264</li>
         * <li>H.265</li>
         * </ul>
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
        public ListLiveTranscodeTemplatesRequest build() {
            return new ListLiveTranscodeTemplatesRequest(this);
        } 

    } 

}
