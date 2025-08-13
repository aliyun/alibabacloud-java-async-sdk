// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeSampleDataListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSampleDataListRequest</p>
 */
public class DescribeSampleDataListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deleteTag")
    private String deleteTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryContent")
    private String queryContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleId")
    private Long sampleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private DescribeSampleDataListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.deleteTag = builder.deleteTag;
        this.pageSize = builder.pageSize;
        this.queryContent = builder.queryContent;
        this.regId = builder.regId;
        this.sampleId = builder.sampleId;
        this.scene = builder.scene;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleDataListRequest create() {
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
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deleteTag
     */
    public String getDeleteTag() {
        return this.deleteTag;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryContent
     */
    public String getQueryContent() {
        return this.queryContent;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sampleId
     */
    public Long getSampleId() {
        return this.sampleId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeSampleDataListRequest, Builder> {
        private String lang; 
        private String currentPage; 
        private String deleteTag; 
        private String pageSize; 
        private String queryContent; 
        private String regId; 
        private Long sampleId; 
        private String scene; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSampleDataListRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.deleteTag = request.deleteTag;
            this.pageSize = request.pageSize;
            this.queryContent = request.queryContent;
            this.regId = request.regId;
            this.sampleId = request.sampleId;
            this.scene = request.scene;
            this.status = request.status;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Deletion status</p>
         * 
         * <strong>example:</strong>
         * <p>DELETE</p>
         */
        public Builder deleteTag(String deleteTag) {
            this.putQueryParameter("deleteTag", deleteTag);
            this.deleteTag = deleteTag;
            return this;
        }

        /**
         * <p>Page size, default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Query content</p>
         * 
         * <strong>example:</strong>
         * <p>手机号</p>
         */
        public Builder queryContent(String queryContent) {
            this.putQueryParameter("queryContent", queryContent);
            this.queryContent = queryContent;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Sample ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5467</p>
         */
        public Builder sampleId(Long sampleId) {
            this.putQueryParameter("sampleId", sampleId);
            this.sampleId = sampleId;
            return this;
        }

        /**
         * <p>Scene</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeSampleDataListRequest build() {
            return new DescribeSampleDataListRequest(this);
        } 

    } 

}
