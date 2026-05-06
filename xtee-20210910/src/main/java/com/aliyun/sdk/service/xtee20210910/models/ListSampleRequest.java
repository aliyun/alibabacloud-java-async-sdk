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
 * {@link ListSampleRequest} extends {@link RequestModel}
 *
 * <p>ListSampleRequest</p>
 */
public class ListSampleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleName")
    private String sampleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tab")
    private String tab;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadTimeEnd")
    private String uploadTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadTimeStart")
    private String uploadTimeStart;

    private ListSampleRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.sampleName = builder.sampleName;
        this.tab = builder.tab;
        this.type = builder.type;
        this.uploadTimeEnd = builder.uploadTimeEnd;
        this.uploadTimeStart = builder.uploadTimeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSampleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sampleName
     */
    public String getSampleName() {
        return this.sampleName;
    }

    /**
     * @return tab
     */
    public String getTab() {
        return this.tab;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uploadTimeEnd
     */
    public String getUploadTimeEnd() {
        return this.uploadTimeEnd;
    }

    /**
     * @return uploadTimeStart
     */
    public String getUploadTimeStart() {
        return this.uploadTimeStart;
    }

    public static final class Builder extends Request.Builder<ListSampleRequest, Builder> {
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private String regId; 
        private String sampleName; 
        private String tab; 
        private String type; 
        private String uploadTimeEnd; 
        private String uploadTimeStart; 

        private Builder() {
            super();
        } 

        private Builder(ListSampleRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.sampleName = request.sampleName;
            this.tab = request.tab;
            this.type = request.type;
            this.uploadTimeEnd = request.uploadTimeEnd;
            this.uploadTimeStart = request.uploadTimeStart;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * SampleName.
         */
        public Builder sampleName(String sampleName) {
            this.putQueryParameter("SampleName", sampleName);
            this.sampleName = sampleName;
            return this;
        }

        /**
         * Tab.
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UploadTimeEnd.
         */
        public Builder uploadTimeEnd(String uploadTimeEnd) {
            this.putQueryParameter("UploadTimeEnd", uploadTimeEnd);
            this.uploadTimeEnd = uploadTimeEnd;
            return this;
        }

        /**
         * UploadTimeStart.
         */
        public Builder uploadTimeStart(String uploadTimeStart) {
            this.putQueryParameter("UploadTimeStart", uploadTimeStart);
            this.uploadTimeStart = uploadTimeStart;
            return this;
        }

        @Override
        public ListSampleRequest build() {
            return new ListSampleRequest(this);
        } 

    } 

}
