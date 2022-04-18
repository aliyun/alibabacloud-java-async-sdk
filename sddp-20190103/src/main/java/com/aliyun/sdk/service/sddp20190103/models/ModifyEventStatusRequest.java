// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyEventStatusRequest</p>
 */
public class ModifyEventStatusRequest extends Request {
    @Query
    @NameInMap("Backed")
    private Boolean backed;

    @Query
    @NameInMap("DealReason")
    private String dealReason;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Integer status;

    private ModifyEventStatusRequest(Builder builder) {
        super(builder);
        this.backed = builder.backed;
        this.dealReason = builder.dealReason;
        this.id = builder.id;
        this.lang = builder.lang;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEventStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backed
     */
    public Boolean getBacked() {
        return this.backed;
    }

    /**
     * @return dealReason
     */
    public String getDealReason() {
        return this.dealReason;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyEventStatusRequest, Builder> {
        private Boolean backed; 
        private String dealReason; 
        private Long id; 
        private String lang; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEventStatusRequest request) {
            super(request);
            this.backed = request.backed;
            this.dealReason = request.dealReason;
            this.id = request.id;
            this.lang = request.lang;
            this.status = request.status;
        } 

        /**
         * Backed.
         */
        public Builder backed(Boolean backed) {
            this.putQueryParameter("Backed", backed);
            this.backed = backed;
            return this;
        }

        /**
         * DealReason.
         */
        public Builder dealReason(String dealReason) {
            this.putQueryParameter("DealReason", dealReason);
            this.dealReason = dealReason;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyEventStatusRequest build() {
            return new ModifyEventStatusRequest(this);
        } 

    } 

}
