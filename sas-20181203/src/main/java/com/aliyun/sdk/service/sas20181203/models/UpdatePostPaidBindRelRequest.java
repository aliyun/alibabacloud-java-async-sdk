// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link UpdatePostPaidBindRelRequest} extends {@link RequestModel}
 *
 * <p>UpdatePostPaidBindRelRequest</p>
 */
public class UpdatePostPaidBindRelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBind")
    private Integer autoBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBindVersion")
    private Integer autoBindVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAction")
    private java.util.List<BindAction> bindAction;

    private UpdatePostPaidBindRelRequest(Builder builder) {
        super(builder);
        this.autoBind = builder.autoBind;
        this.autoBindVersion = builder.autoBindVersion;
        this.bindAction = builder.bindAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePostPaidBindRelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoBind
     */
    public Integer getAutoBind() {
        return this.autoBind;
    }

    /**
     * @return autoBindVersion
     */
    public Integer getAutoBindVersion() {
        return this.autoBindVersion;
    }

    /**
     * @return bindAction
     */
    public java.util.List<BindAction> getBindAction() {
        return this.bindAction;
    }

    public static final class Builder extends Request.Builder<UpdatePostPaidBindRelRequest, Builder> {
        private Integer autoBind; 
        private Integer autoBindVersion; 
        private java.util.List<BindAction> bindAction; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePostPaidBindRelRequest request) {
            super(request);
            this.autoBind = request.autoBind;
            this.autoBindVersion = request.autoBindVersion;
            this.bindAction = request.bindAction;
        } 

        /**
         * <p>Enable automatic binding for new assets. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Off</li>
         * <li><strong>1</strong>: On</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoBind(Integer autoBind) {
            this.putQueryParameter("AutoBind", autoBind);
            this.autoBind = autoBind;
            return this;
        }

        /**
         * <p>Version to automatically bind when adding new assets. Values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic Edition </li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>6</strong>: Antivirus Edition    </li>
         * <li><strong>7</strong>: Container Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder autoBindVersion(Integer autoBindVersion) {
            this.putQueryParameter("AutoBindVersion", autoBindVersion);
            this.autoBindVersion = autoBindVersion;
            return this;
        }

        /**
         * <p>Parameters for the binding action.</p>
         */
        public Builder bindAction(java.util.List<BindAction> bindAction) {
            this.putQueryParameter("BindAction", bindAction);
            this.bindAction = bindAction;
            return this;
        }

        @Override
        public UpdatePostPaidBindRelRequest build() {
            return new UpdatePostPaidBindRelRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePostPaidBindRelRequest} extends {@link TeaModel}
     *
     * <p>UpdatePostPaidBindRelRequest</p>
     */
    public static class BindAction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindAll")
        private Boolean bindAll;

        @com.aliyun.core.annotation.NameInMap("UuidList")
        private java.util.List<String> uuidList;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private BindAction(Builder builder) {
            this.bindAll = builder.bindAll;
            this.uuidList = builder.uuidList;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindAction create() {
            return builder().build();
        }

        /**
         * @return bindAll
         */
        public Boolean getBindAll() {
            return this.bindAll;
        }

        /**
         * @return uuidList
         */
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean bindAll; 
            private java.util.List<String> uuidList; 
            private String version; 

            private Builder() {
            } 

            private Builder(BindAction model) {
                this.bindAll = model.bindAll;
                this.uuidList = model.uuidList;
                this.version = model.version;
            } 

            /**
             * <p>Whether to bind all. Default is <strong>false</strong>. Values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes</li>
             * <li><strong>false</strong>: No</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bindAll(Boolean bindAll) {
                this.bindAll = bindAll;
                return this;
            }

            /**
             * <p>List of specified server UUIDs.</p>
             */
            public Builder uuidList(java.util.List<String> uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            /**
             * <p>The Cloud Security Center protection version that needs to be bound. Values:  </p>
             * <ul>
             * <li><strong>1</strong>: Basic Edition </li>
             * <li><strong>3</strong>: Enterprise Edition</li>
             * <li><strong>5</strong>: Advanced Edition</li>
             * <li><strong>6</strong>: Antivirus Edition    </li>
             * <li><strong>7</strong>: Container Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BindAction build() {
                return new BindAction(this);
            } 

        } 

    }
}
