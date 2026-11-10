// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link ModifyBackupObjectsRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupObjectsRequest</p>
 */
public class ModifyBackupObjectsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupObjects")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupObjects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    private ModifyBackupObjectsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupObjects = builder.backupObjects;
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupObjectsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupObjects
     */
    public String getBackupObjects() {
        return this.backupObjects;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ModifyBackupObjectsRequest, Builder> {
        private String regionId; 
        private String backupObjects; 
        private String backupPlanId; 
        private String clientToken; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupObjectsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupObjects = request.backupObjects;
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The backup objects, specified as a JSON string. The structure is as follows:</p>
         * <pre><code>[
         *     {
         *         &quot;DBName&quot;:&quot;The name of the database to back up&quot;,
         *         &quot;SchemaName&quot;:&quot;The name of the schema to back up&quot;,
         *         &quot;TableIncludes&quot;:[{
         *             &quot;TableName&quot;:&quot;The name of the table to back up&quot;
         *         }],
         *         &quot;TableExcludes&quot;:[{
         *             &quot;TableName&quot;:&quot;The name of a table in the database that you do not want to back up&quot;
         *         }]
         *     }
         * ]
         * </code></pre>
         * <ul>
         * <li><p>If you specify only <code>DBName</code> without configuring rules for sub-objects, all objects in the database are backed up.</p>
         * </li>
         * <li><p>If you specify <code>DBName</code> and configure rules for some objects, any objects without configured rules are not backed up by default. The following regular expressions are supported for defining object names:</p>
         * <ul>
         * <li>A period (<code>.</code>) matches any single character except `</li>
         * </ul>
         * </li>
         * </ul>
         * <p>`.</p>
         * <ul>
         * <li><p>An asterisk (<code>*</code>) matches the preceding subexpression zero or more times. For example, <code>h*llo</code> matches <code>hllo</code> and <code>heeeello</code>.</p>
         * </li>
         * <li><p>A question mark (<code>?</code>) matches the preceding subexpression zero or one time. For example, <code>h.?llo</code> matches <code>hllo</code> and <code>hello</code>, but not <code>haello</code>.</p>
         * </li>
         * <li><p>A character set <code>[characters]</code> matches any single character within the brackets. For example, <code>h[aello]</code> matches <code>hallo</code> and <code>hello</code>.</p>
         * </li>
         * <li><p>A negated character set <code>[^characters]</code> matches any single character not within the brackets. For example, <code>h[^ae]llo</code> matches <code>hcllo</code> and <code>hdllo</code>, but not <code>hallo</code> or <code>hello</code>.</p>
         * </li>
         * <li><p>A character range <code>[character1-character2]</code> matches any character within the specified range, such as <code>[0-9]</code> or <code>[a-z]</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p><code>SchemaName</code> and <code>NewSchemaName</code> are used only for SQL Server. For other database engines, use <code>DBName</code> and <code>NewDBName</code> to specify database names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[     {         &quot;DBName&quot;:&quot;17xxx92xxxx374&quot;,         &quot;SchemaName&quot;:&quot;gy9xnj8xxxxxx&quot;,         &quot;TableIncludes&quot;:[{         	&quot;TableName&quot;:&quot;test1&quot;         }],         &quot;TableExcludes&quot;:[{             &quot;TableName&quot;:&quot;test2&quot;         }]     } ]</p>
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
            return this;
        }

        /**
         * <p>The ID of the backup plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbs1h****usfa</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>A client token to ensure the request is idempotent. This prevents the same request from being submitted multiple times.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public ModifyBackupObjectsRequest build() {
            return new ModifyBackupObjectsRequest(this);
        } 

    } 

}
