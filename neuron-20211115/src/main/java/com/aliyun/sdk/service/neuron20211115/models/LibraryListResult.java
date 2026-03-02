// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link LibraryListResult} extends {@link TeaModel}
 *
 * <p>LibraryListResult</p>
 */
public class LibraryListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("librarys")
    private java.util.List<Library> librarys;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private LibraryListResult(Builder builder) {
        this.librarys = builder.librarys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LibraryListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return librarys
     */
    public java.util.List<Library> getLibrarys() {
        return this.librarys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Library> librarys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LibraryListResult model) {
            this.librarys = model.librarys;
            this.requestId = model.requestId;
        } 

        /**
         * librarys.
         */
        public Builder librarys(java.util.List<Library> librarys) {
            this.librarys = librarys;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LibraryListResult build() {
            return new LibraryListResult(this);
        } 

    } 

}
