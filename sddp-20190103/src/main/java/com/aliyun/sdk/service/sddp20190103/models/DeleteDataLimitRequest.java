// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataLimitRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataLimitRequest</p>
 */
public class DeleteDataLimitRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DeleteDataLimitRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataLimitRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DeleteDataLimitRequest, Builder> {
        private Long id; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataLimitRequest request) {
            super(request);
            this.id = request.id;
            this.lang = request.lang;
        } 

        /**
         * The ID of the data asset.
         * <p>
         * 
         * You can call the DescribeDataLimits operation to query the IDs of data assets. The value of the Id response parameter indicates the ID of a data asset.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DeleteDataLimitRequest build() {
            return new DeleteDataLimitRequest(this);
        } 

    } 

}
