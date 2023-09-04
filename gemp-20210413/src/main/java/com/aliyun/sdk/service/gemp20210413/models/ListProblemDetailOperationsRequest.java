// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemDetailOperationsRequest} extends {@link RequestModel}
 *
 * <p>ListProblemDetailOperationsRequest</p>
 */
public class ListProblemDetailOperationsRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("createTimeSort")
    private String createTimeSort;

    @Body
    @NameInMap("pageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("pageSize")
    private Integer pageSize;

    @Body
    @NameInMap("problemId")
    @Validation(required = true)
    private Long problemId;

    private ListProblemDetailOperationsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.createTimeSort = builder.createTimeSort;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.problemId = builder.problemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProblemDetailOperationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return createTimeSort
     */
    public String getCreateTimeSort() {
        return this.createTimeSort;
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
     * @return problemId
     */
    public Long getProblemId() {
        return this.problemId;
    }

    public static final class Builder extends Request.Builder<ListProblemDetailOperationsRequest, Builder> {
        private String clientToken; 
        private String createTimeSort; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long problemId; 

        private Builder() {
            super();
        } 

        private Builder(ListProblemDetailOperationsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.createTimeSort = request.createTimeSort;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.problemId = request.problemId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * createTimeSort.
         */
        public Builder createTimeSort(String createTimeSort) {
            this.putBodyParameter("createTimeSort", createTimeSort);
            this.createTimeSort = createTimeSort;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * problemId.
         */
        public Builder problemId(Long problemId) {
            this.putBodyParameter("problemId", problemId);
            this.problemId = problemId;
            return this;
        }

        @Override
        public ListProblemDetailOperationsRequest build() {
            return new ListProblemDetailOperationsRequest(this);
        } 

    } 

}
