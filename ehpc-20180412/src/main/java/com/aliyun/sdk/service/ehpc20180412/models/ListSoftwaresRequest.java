// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListSoftwaresRequest} extends {@link RequestModel}
 *
 * <p>ListSoftwaresRequest</p>
 */
public class ListSoftwaresRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EhpcVersion")
    private String ehpcVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsTag")
    private String osTag;

    private ListSoftwaresRequest(Builder builder) {
        super(builder);
        this.ehpcVersion = builder.ehpcVersion;
        this.osTag = builder.osTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSoftwaresRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ehpcVersion
     */
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    /**
     * @return osTag
     */
    public String getOsTag() {
        return this.osTag;
    }

    public static final class Builder extends Request.Builder<ListSoftwaresRequest, Builder> {
        private String ehpcVersion; 
        private String osTag; 

        private Builder() {
            super();
        } 

        private Builder(ListSoftwaresRequest request) {
            super(request);
            this.ehpcVersion = request.ehpcVersion;
            this.osTag = request.osTag;
        } 

        /**
         * <p>The version of the E-HPC client.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87223.html">ListCurrentClientVersion</a> operation to query the E-HPC client version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder ehpcVersion(String ehpcVersion) {
            this.putQueryParameter("EhpcVersion", ehpcVersion);
            this.ehpcVersion = ehpcVersion;
            return this;
        }

        /**
         * <p>The image tag of the cluster.</p>
         * <p>You can use the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> to query the image tag of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS_7.2_64</p>
         */
        public Builder osTag(String osTag) {
            this.putQueryParameter("OsTag", osTag);
            this.osTag = osTag;
            return this;
        }

        @Override
        public ListSoftwaresRequest build() {
            return new ListSoftwaresRequest(this);
        } 

    } 

}
