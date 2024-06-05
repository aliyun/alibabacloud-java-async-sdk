// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOfficeEditUrlOption} extends {@link TeaModel}
 *
 * <p>GetOfficeEditUrlOption</p>
 */
public class GetOfficeEditUrlOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("copy")
    private Boolean copy;

    @com.aliyun.core.annotation.NameInMap("print")
    private Boolean print;

    @com.aliyun.core.annotation.NameInMap("readonly")
    private Boolean readonly;

    private GetOfficeEditUrlOption(Builder builder) {
        this.copy = builder.copy;
        this.print = builder.print;
        this.readonly = builder.readonly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOfficeEditUrlOption create() {
        return builder().build();
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

    /**
     * @return readonly
     */
    public Boolean getReadonly() {
        return this.readonly;
    }

    public static final class Builder {
        private Boolean copy; 
        private Boolean print; 
        private Boolean readonly; 

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

        /**
         * readonly.
         */
        public Builder readonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }

        public GetOfficeEditUrlOption build() {
            return new GetOfficeEditUrlOption(this);
        } 

    } 

}
