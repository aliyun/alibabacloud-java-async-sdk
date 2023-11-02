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
         * From.
         */
        public Builder from(Integer from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Index.
         */
        public Builder index(String index) {
            this.putBodyParameter("Index", index);
            this.index = index;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putBodyParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * To.
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
