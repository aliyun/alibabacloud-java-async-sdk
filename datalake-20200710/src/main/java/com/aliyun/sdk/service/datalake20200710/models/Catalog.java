// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Catalog} extends {@link TeaModel}
 *
 * <p>Catalog</p>
 */
public class Catalog extends TeaModel {
    @NameInMap("CatalogId")
    private String catalogId;

    @NameInMap("CreateTime")
    private Integer createTime;

    private Catalog(Builder builder) {
        this.catalogId = builder.catalogId;
        this.createTime = builder.createTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Catalog create() {
        return builder().build();
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    public static final class Builder {
        private String catalogId; 
        private Integer createTime; 

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * CreateTime
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        public Catalog build() {
            return new Catalog(this);
        } 

    } 

}
