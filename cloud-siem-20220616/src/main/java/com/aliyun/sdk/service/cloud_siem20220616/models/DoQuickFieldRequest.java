// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoQuickFieldRequest} extends {@link RequestModel}
 *
 * <p>DoQuickFieldRequest</p>
 */
public class DoQuickFieldRequest extends Request {
    @Body
    @NameInMap("From")
    @Validation(required = true)
    private Integer from;

    @Body
    @NameInMap("Index")
    @Validation(required = true)
    private String index;

    @Body
    @NameInMap("Page")
    private Integer page;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Reverse")
    private Boolean reverse;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("To")
    @Validation(required = true)
    private Integer to;

    private DoQuickFieldRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.index = builder.index;
        this.page = builder.page;
        this.regionId = builder.regionId;
        this.reverse = builder.reverse;
        this.size = builder.size;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoQuickFieldRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return index
     */
    public String getIndex() {
        return this.index;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<DoQuickFieldRequest, Builder> {
        private Integer from; 
        private String index; 
        private Integer page; 
        private String regionId; 
        private Boolean reverse; 
        private Integer size; 
        private Integer to; 

        private Builder() {
            super();
        } 

        private Builder(DoQuickFieldRequest request) {
            super(request);
            this.from = request.from;
            this.index = request.index;
            this.page = request.page;
            this.regionId = request.regionId;
            this.reverse = request.reverse;
            this.size = request.size;
            this.to = request.to;
        } 

        /**
         * The time when the quick analysis starts. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder from(Integer from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The index field.
         */
        public Builder index(String index) {
            this.putBodyParameter("Index", index);
            this.index = index;
            return this;
        }

        /**
         * The number of pages to return. Default value: 1.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions inside the Chinese mainland or in the China (Hong Kong) region.
         * *   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The sorting of the query and analysis results. By default, the results are sorted in descending order.
         */
        public Builder reverse(Boolean reverse) {
            this.putBodyParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * The time when the quick analysis ends. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder to(Integer to) {
            this.putBodyParameter("To", to);
            this.to = to;
            return this;
        }

        @Override
        public DoQuickFieldRequest build() {
            return new DoQuickFieldRequest(this);
        } 

    } 

}
