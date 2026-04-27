// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListUnknownThreatDetectStrategyRequest} extends {@link RequestModel}
 *
 * <p>ListUnknownThreatDetectStrategyRequest</p>
 */
public class ListUnknownThreatDetectStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudyMode")
    private String studyMode;

    private ListUnknownThreatDetectStrategyRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.id = builder.id;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.studyMode = builder.studyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnknownThreatDetectStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return studyMode
     */
    public String getStudyMode() {
        return this.studyMode;
    }

    public static final class Builder extends Request.Builder<ListUnknownThreatDetectStrategyRequest, Builder> {
        private String currentPage; 
        private String id; 
        private String name; 
        private String pageSize; 
        private String studyMode; 

        private Builder() {
            super();
        } 

        private Builder(ListUnknownThreatDetectStrategyRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.id = request.id;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.studyMode = request.studyMode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StudyMode.
         */
        public Builder studyMode(String studyMode) {
            this.putQueryParameter("StudyMode", studyMode);
            this.studyMode = studyMode;
            return this;
        }

        @Override
        public ListUnknownThreatDetectStrategyRequest build() {
            return new ListUnknownThreatDetectStrategyRequest(this);
        } 

    } 

}
