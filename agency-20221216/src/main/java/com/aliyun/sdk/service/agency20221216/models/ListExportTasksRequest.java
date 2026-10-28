// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link ListExportTasksRequest} extends {@link RequestModel}
 *
 * <p>ListExportTasksRequest</p>
 */
public class ListExportTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneCode;

    private ListExportTasksRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.language = builder.language;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sceneCode = builder.sceneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExportTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    public static final class Builder extends Request.Builder<ListExportTasksRequest, Builder> {
        private Long id; 
        private String language; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sceneCode; 

        private Builder() {
            super();
        } 

        private Builder(ListExportTasksRequest request) {
            super(request);
            this.id = request.id;
            this.language = request.language;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sceneCode = request.sceneCode;
        } 

        /**
         * <p>The ID of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>12343</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li>en: English.</li>
         * <li>zh: Chinese.</li>
         * <li>ja: Japanese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The current page number. Pages start from 1.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of entries per page. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
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
         * <p>The export scenario code. Valid values:</p>
         * <ul>
         * <li>intlCustomerQuotaRecord: Customer management, quota transaction export.</li>
         * <li>intlExportUsageDeductHistory: Customer management, deduction detail export.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>intlExportUsageDeductHistory</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        @Override
        public ListExportTasksRequest build() {
            return new ListExportTasksRequest(this);
        } 

    } 

}
