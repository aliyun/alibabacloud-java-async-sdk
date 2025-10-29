// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ListBrowsersInput} extends {@link TeaModel}
 *
 * <p>ListBrowsersInput</p>
 */
public class ListBrowsersInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("browserName")
    private String browserName;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListBrowsersInput(Builder builder) {
        this.browserName = builder.browserName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBrowsersInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserName
     */
    public String getBrowserName() {
        return this.browserName;
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

    public static final class Builder {
        private String browserName; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
        } 

        private Builder(ListBrowsersInput model) {
            this.browserName = model.browserName;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
        } 

        /**
         * <p>按浏览器名称过滤</p>
         * 
         * <strong>example:</strong>
         * <p>my-browser</p>
         */
        public Builder browserName(String browserName) {
            this.browserName = browserName;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public ListBrowsersInput build() {
            return new ListBrowsersInput(this);
        } 

    } 

}
