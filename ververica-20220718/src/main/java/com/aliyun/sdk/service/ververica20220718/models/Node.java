// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link Node} extends {@link TeaModel}
 *
 * <p>Node</p>
 */
public class Node extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("connector")
    private String connector;

    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("isTemporary")
    private Boolean isTemporary;

    @com.aliyun.core.annotation.NameInMap("tables")
    private java.util.List<LineageTable> tables;

    private Node(Builder builder) {
        this.catalogName = builder.catalogName;
        this.connector = builder.connector;
        this.databaseName = builder.databaseName;
        this.id = builder.id;
        this.isTemporary = builder.isTemporary;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Node create() {
        return builder().build();
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return connector
     */
    public String getConnector() {
        return this.connector;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return isTemporary
     */
    public Boolean getIsTemporary() {
        return this.isTemporary;
    }

    /**
     * @return tables
     */
    public java.util.List<LineageTable> getTables() {
        return this.tables;
    }

    public static final class Builder {
        private String catalogName; 
        private String connector; 
        private String databaseName; 
        private String id; 
        private Boolean isTemporary; 
        private java.util.List<LineageTable> tables; 

        /**
         * catalogName.
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * connector.
         */
        public Builder connector(String connector) {
            this.connector = connector;
            return this;
        }

        /**
         * databaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * isTemporary.
         */
        public Builder isTemporary(Boolean isTemporary) {
            this.isTemporary = isTemporary;
            return this;
        }

        /**
         * tables.
         */
        public Builder tables(java.util.List<LineageTable> tables) {
            this.tables = tables;
            return this;
        }

        public Node build() {
            return new Node(this);
        } 

    } 

}
