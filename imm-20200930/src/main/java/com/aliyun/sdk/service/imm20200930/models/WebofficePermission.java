// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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

        private Builder() {
        } 

        private Builder(WebofficePermission model) {
            this.copy = model.copy;
            this.export = model.export;
            this.history = model.history;
            this.print = model.print;
            this.readonly = model.readonly;
            this.rename = model.rename;
        } 

        /**
         * <p>Specifies whether the user has the copy permission. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder copy(Boolean copy) {
            this.copy = copy;
            return this;
        }

        /**
         * <p>Specifies whether the user has the permission to export the file as a PDF file. Valid values:</p>
         * <ul>
         * <li>true: The user has the permission to export the file as a PDF file. If you set this parameter to true, you must set the Print parameter to true.</li>
         * <li>false: The user does not have the permission to export the file as a PDF file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder export(Boolean export) {
            this.export = export;
            return this;
        }

        /**
         * <p>Specifies whether the user has the permission to view historical versions. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder history(Boolean history) {
            this.history = history;
            return this;
        }

        /**
         * <p>Specifies whether the user has the printing permission. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder print(Boolean print) {
            this.print = print;
            return this;
        }

        /**
         * <p>Specifies whether the user has read-only access to the file. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder readonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }

        /**
         * <p>Specifies whether the user has the permission to rename a file. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> You can query the operation information only based a notification sent to Simple Message Queue (SMQ). A rename event is included in the notification.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
