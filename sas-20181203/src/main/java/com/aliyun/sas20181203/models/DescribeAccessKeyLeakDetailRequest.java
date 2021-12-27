// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeAccessKeyLeakDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessKeyLeakDetailRequest</p>
 */
public class DescribeAccessKeyLeakDetailRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;


    private DescribeAccessKeyLeakDetailRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessKeyLeakDetailRequest create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Long id; 

        /**
         * <p>Id.</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        public DescribeAccessKeyLeakDetailRequest build() {
            return new DescribeAccessKeyLeakDetailRequest(this);
        } 

    } 

}
