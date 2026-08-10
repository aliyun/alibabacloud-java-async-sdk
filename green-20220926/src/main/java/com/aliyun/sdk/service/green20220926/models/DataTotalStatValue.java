// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link DataTotalStatValue} extends {@link TeaModel}
 *
 * <p>DataTotalStatValue</p>
 */
public class DataTotalStatValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("Share")
    private String share;

    private DataTotalStatValue(Builder builder) {
        this.total = builder.total;
        this.share = builder.share;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataTotalStatValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return share
     */
    public String getShare() {
        return this.share;
    }

    public static final class Builder {
        private Long total; 
        private String share; 

        private Builder() {
        } 

        private Builder(DataTotalStatValue model) {
            this.total = model.total;
            this.share = model.share;
        } 

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * Share.
         */
        public Builder share(String share) {
            this.share = share;
            return this;
        }

        public DataTotalStatValue build() {
            return new DataTotalStatValue(this);
        } 

    } 

}
