// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WebofficePermission} extends {@link TeaModel}
 *
 * <p>WebofficePermission</p>
 */
public class WebofficePermission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Copy")
    private Boolean copy;

    @com.aliyun.core.annotation.NameInMap("Export")
    private Boolean export;

    @com.aliyun.core.annotation.NameInMap("History")
    private Boolean history;

    @com.aliyun.core.annotation.NameInMap("Print")
    private Boolean print;

    @com.aliyun.core.annotation.NameInMap("Readonly")
    private Boolean readonly;

    @com.aliyun.core.annotation.NameInMap("Rename")
    private Boolean rename;

    private WebofficePermission(Builder builder) {
        this.copy = builder.copy;
        this.export = builder.export;
        this.history = builder.history;
        this.print = builder.print;
        this.readonly = builder.readonly;
        this.rename = builder.rename;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebofficePermission create() {
        return builder().build();
    }

    /**
     * @return copy
     */
    public Boolean getCopy() {
        return this.copy;
    }

    /**
     * @return export
     */
    public Boolean getExport() {
        return this.export;
    }

    /**
     * @return history
     */
    public Boolean getHistory() {
        return this.history;
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

    /**
     * @return rename
     */
    public Boolean getRename() {
        return this.rename;
    }

    public static final class Builder {
        private Boolean copy; 
        private Boolean export; 
        private Boolean history; 
        private Boolean print; 
        private Boolean readonly; 
        private Boolean rename; 

        /**
         * Copy.
         */
        public Builder copy(Boolean copy) {
            this.copy = copy;
            return this;
        }

        /**
         * Export.
         */
        public Builder export(Boolean export) {
            this.export = export;
            return this;
        }

        /**
         * History.
         */
        public Builder history(Boolean history) {
            this.history = history;
            return this;
        }

        /**
         * Print.
         */
        public Builder print(Boolean print) {
            this.print = print;
            return this;
        }

        /**
         * Readonly.
         */
        public Builder readonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }

        /**
         * Rename.
         */
        public Builder rename(Boolean rename) {
            this.rename = rename;
            return this;
        }

        public WebofficePermission build() {
            return new WebofficePermission(this);
        } 

    } 

}
