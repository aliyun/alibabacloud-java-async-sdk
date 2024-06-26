// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonResponsePageableStructBody} extends {@link TeaModel}
 *
 * <p>CommonResponsePageableStructBody</p>
 */
public class CommonResponsePageableStructBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Current")
    private String current;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < TriggerLogDTOStructBody > list;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private CommonResponsePageableStructBody(Builder builder) {
        this.current = builder.current;
        this.list = builder.list;
        this.pageSize = builder.pageSize;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonResponsePageableStructBody create() {
        return builder().build();
    }

    /**
     * @return current
     */
    public String getCurrent() {
        return this.current;
    }

    /**
     * @return list
     */
    public java.util.List < TriggerLogDTOStructBody > getList() {
        return this.list;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String current; 
        private java.util.List < TriggerLogDTOStructBody > list; 
        private String pageSize; 
        private String total; 

        /**
         * Current.
         */
        public Builder current(String current) {
            this.current = current;
            return this;
        }

        /**
         * List.
         */
        public Builder list(java.util.List < TriggerLogDTOStructBody > list) {
            this.list = list;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public CommonResponsePageableStructBody build() {
            return new CommonResponsePageableStructBody(this);
        } 

    } 

}
