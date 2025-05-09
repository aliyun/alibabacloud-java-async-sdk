// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetOfficePreviewUrlOption} extends {@link TeaModel}
 *
 * <p>GetOfficePreviewUrlOption</p>
 */
public class GetOfficePreviewUrlOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("copy")
    private Boolean copy;

    @com.aliyun.core.annotation.NameInMap("print")
    private Boolean print;

    private GetOfficePreviewUrlOption(Builder builder) {
        this.copy = builder.copy;
        this.print = builder.print;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOfficePreviewUrlOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return copy
     */
    public Boolean getCopy() {
        return this.copy;
    }

    /**
     * @return print
     */
    public Boolean getPrint() {
        return this.print;
    }

    public static final class Builder {
        private Boolean copy; 
        private Boolean print; 

        private Builder() {
        } 

        private Builder(GetOfficePreviewUrlOption model) {
            this.copy = model.copy;
            this.print = model.print;
        } 

        /**
         * copy.
         */
        public Builder copy(Boolean copy) {
            this.copy = copy;
            return this;
        }

        /**
         * print.
         */
        public Builder print(Boolean print) {
            this.print = print;
            return this;
        }

        public GetOfficePreviewUrlOption build() {
            return new GetOfficePreviewUrlOption(this);
        } 

    } 

}
