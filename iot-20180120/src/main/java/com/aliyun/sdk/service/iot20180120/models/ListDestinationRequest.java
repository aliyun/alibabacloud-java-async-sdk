// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDestinationRequest} extends {@link RequestModel}
 *
 * <p>ListDestinationRequest</p>
 */
public class ListDestinationRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Page")
    @Validation(required = true, maximum = 9999999, minimum = 1)
    private Integer page;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SearchName")
    private String searchName;

    @Query
    @NameInMap("Types")
    private java.util.List < String > types;

    private ListDestinationRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.searchName = builder.searchName;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDestinationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    /**
     * @return types
     */
    public java.util.List < String > getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListDestinationRequest, Builder> {
        private String iotInstanceId; 
        private Integer page; 
        private Integer pageSize; 
        private String searchName; 
        private java.util.List < String > types; 

        private Builder() {
            super();
        } 

        private Builder(ListDestinationRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.searchName = request.searchName;
            this.types = request.types;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
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
         * SearchName.
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(java.util.List < String > types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public ListDestinationRequest build() {
            return new ListDestinationRequest(this);
        } 

    } 

}
