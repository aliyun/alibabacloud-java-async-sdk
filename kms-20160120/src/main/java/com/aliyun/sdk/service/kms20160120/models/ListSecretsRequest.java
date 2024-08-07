// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretsRequest} extends {@link RequestModel}
 *
 * <p>ListSecretsRequest</p>
 */
public class ListSecretsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FetchTags")
    private String fetchTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private String filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private ListSecretsRequest(Builder builder) {
        super(builder);
        this.fetchTags = builder.fetchTags;
        this.filters = builder.filters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fetchTags
     */
    public String getFetchTags() {
        return this.fetchTags;
    }

    /**
     * @return filters
     */
    public String getFilters() {
        return this.filters;
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

    public static final class Builder extends Request.Builder<ListSecretsRequest, Builder> {
        private String fetchTags; 
        private String filters; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListSecretsRequest request) {
            super(request);
            this.fetchTags = request.fetchTags;
            this.filters = request.filters;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 10.
         */
        public Builder fetchTags(String fetchTags) {
            this.putQueryParameter("FetchTags", fetchTags);
            this.fetchTags = fetchTags;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder filters(String filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * The secret filter. The filter consists of one or more key-value pairs. You can specify one key-value pair or leave this parameter empty. If you use one tag key or tag value to filter resources, up to 4,000 resources can be queried. If you want to query more than 4,000 resources, call the [ListResourceTags](~~120090~~) operation.
         * <p>
         * 
         * *   Key
         * 
         *     *   Description: the property that you want to filter.
         * 
         *     *   Type: string.
         * 
         *     *   Valid values:
         * 
         *         *   SecretName: the secret name.
         *         *   Description: the description of the secret.
         *         *   TagKey: the tag key.
         *         *   TagValue: the tag value.
         * 
         * *   Values
         * 
         *     *   Description: the value to be included after filtering.
         * 
         *     *   Type: string.
         * 
         *     *   Length: 0 to 10.
         * 
         *     *   Valid values:
         * 
         *         *   If the Key field is set to SecretName, the value must be 1 to 192 characters in length and can contain letters, digits, and special characters `_ / + = . @ -`.
         *         *   If the Key field is set to Description, the value must be 1 to 256 characters in length.
         *         *   If the Key field is set to TagKey, the value must be 1 to 256 characters in length and can contain letters, digits, and special characters `/ _ - . + = @ :`.
         *         *   If the Key field is set to TagValue, the value must be 1 to 256 characters in length and can contain letters, numbers, and special characters `/ _ - . + = @ :`.
         * 
         * The logical relationship between values of the Values field in a key-value pair is OR. Example: `[ {"Key":"SecretName", "Values":["sec1","sec2"]}]`. In this example, the semantics are `SecretName=sec 1 OR SecretName=sec 2`.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListSecretsRequest build() {
            return new ListSecretsRequest(this);
        } 

    } 

}
