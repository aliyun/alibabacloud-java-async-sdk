// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListScriptRecordingRequest} extends {@link RequestModel}
 *
 * <p>ListScriptRecordingRequest</p>
 */
public class ListScriptRecordingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefIdsJson")
    private String refIdsJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Search")
    private String search;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatesJson")
    private String statesJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidsJson")
    private String uuidsJson;

    private ListScriptRecordingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.refIdsJson = builder.refIdsJson;
        this.scriptId = builder.scriptId;
        this.search = builder.search;
        this.statesJson = builder.statesJson;
        this.uuidsJson = builder.uuidsJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptRecordingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return refIdsJson
     */
    public String getRefIdsJson() {
        return this.refIdsJson;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    /**
     * @return statesJson
     */
    public String getStatesJson() {
        return this.statesJson;
    }

    /**
     * @return uuidsJson
     */
    public String getUuidsJson() {
        return this.uuidsJson;
    }

    public static final class Builder extends Request.Builder<ListScriptRecordingRequest, Builder> {
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String refIdsJson; 
        private String scriptId; 
        private String search; 
        private String statesJson; 
        private String uuidsJson; 

        private Builder() {
            super();
        } 

        private Builder(ListScriptRecordingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.refIdsJson = request.refIdsJson;
            this.scriptId = request.scriptId;
            this.search = request.search;
            this.statesJson = request.statesJson;
            this.uuidsJson = request.uuidsJson;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c209abb3-6804-4a75-b2c7-dd55c8c61b6a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RefIdsJson.
         */
        public Builder refIdsJson(String refIdsJson) {
            this.putQueryParameter("RefIdsJson", refIdsJson);
            this.refIdsJson = refIdsJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * Search.
         */
        public Builder search(String search) {
            this.putQueryParameter("Search", search);
            this.search = search;
            return this;
        }

        /**
         * StatesJson.
         */
        public Builder statesJson(String statesJson) {
            this.putQueryParameter("StatesJson", statesJson);
            this.statesJson = statesJson;
            return this;
        }

        /**
         * UuidsJson.
         */
        public Builder uuidsJson(String uuidsJson) {
            this.putQueryParameter("UuidsJson", uuidsJson);
            this.uuidsJson = uuidsJson;
            return this;
        }

        @Override
        public ListScriptRecordingRequest build() {
            return new ListScriptRecordingRequest(this);
        } 

    } 

}
