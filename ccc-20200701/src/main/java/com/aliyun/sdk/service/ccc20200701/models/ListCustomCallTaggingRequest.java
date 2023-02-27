// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomCallTaggingRequest} extends {@link RequestModel}
 *
 * <p>ListCustomCallTaggingRequest</p>
 */
public class ListCustomCallTaggingRequest extends Request {
    @Query
    @NameInMap("CallTagNameList")
    private String callTagNameList;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("SearchPattern")
    private String searchPattern;

    private ListCustomCallTaggingRequest(Builder builder) {
        super(builder);
        this.callTagNameList = builder.callTagNameList;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchPattern = builder.searchPattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomCallTaggingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callTagNameList
     */
    public String getCallTagNameList() {
        return this.callTagNameList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return searchPattern
     */
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public static final class Builder extends Request.Builder<ListCustomCallTaggingRequest, Builder> {
        private String callTagNameList; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchPattern; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomCallTaggingRequest request) {
            super(request);
            this.callTagNameList = request.callTagNameList;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchPattern = request.searchPattern;
        } 

        /**
         * CallTagNameList.
         */
        public Builder callTagNameList(String callTagNameList) {
            this.putQueryParameter("CallTagNameList", callTagNameList);
            this.callTagNameList = callTagNameList;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * SearchPattern.
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        @Override
        public ListCustomCallTaggingRequest build() {
            return new ListCustomCallTaggingRequest(this);
        } 

    } 

}
