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
         * <p>Instance ID of the recording</p>
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
         * <p>Page number</p>
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
         * <p>Number of entries per page</p>
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
         * <p>Recording ID list (JSON format), same as UuidsJson</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;d9fad189-760b-47b9-837f-aeabb4fc9109\&quot;]</p>
         */
        public Builder refIdsJson(String refIdsJson) {
            this.putQueryParameter("RefIdsJson", refIdsJson);
            this.refIdsJson = refIdsJson;
            return this;
        }

        /**
         * <p>Scenario ID of the recording</p>
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
         * <p>Search criteria: Search by recording name or content.</p>
         * 
         * <strong>example:</strong>
         * <p>您好</p>
         */
        public Builder search(String search) {
            this.putQueryParameter("Search", search);
            this.search = search;
            return this;
        }

        /**
         * <p>Recording status</p>
         * <ul>
         * <li><p>Validating: 1</p>
         * </li>
         * <li><p>Validation failed: 2</p>
         * </li>
         * <li><p>Processing: 3</p>
         * </li>
         * <li><p>Processing failed: 4</p>
         * </li>
         * <li><p>Reviewing: 5</p>
         * </li>
         * <li><p>Review failed: 6</p>
         * </li>
         * <li><p>Publish failed: 7</p>
         * </li>
         * <li><p>Published: 8</p>
         * </li>
         * <li><p>Pending publish: 9</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *      &quot;8&quot;
         * ]</p>
         */
        public Builder statesJson(String statesJson) {
            this.putQueryParameter("StatesJson", statesJson);
            this.statesJson = statesJson;
            return this;
        }

        /**
         * <p>Recording ID list</p>
         * <blockquote>
         * <p>This is a list of unique recording IDs. If left blank, all recordings display.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;d17d5bfa-4972-4389-9718-f9602edabe48&quot;]</p>
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
