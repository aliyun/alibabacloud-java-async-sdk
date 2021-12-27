// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyGroupPropertyRequest} extends {@link RequestModel}
 *
 * <p>ModifyGroupPropertyRequest</p>
 */
public class ModifyGroupPropertyRequest extends Request {
    @Query
    @NameInMap("Data")
    private String data;


    private ModifyGroupPropertyRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGroupPropertyRequest create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String data; 

        /**
         * <p>Data.</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        public ModifyGroupPropertyRequest build() {
            return new ModifyGroupPropertyRequest(this);
        } 

    } 

}
